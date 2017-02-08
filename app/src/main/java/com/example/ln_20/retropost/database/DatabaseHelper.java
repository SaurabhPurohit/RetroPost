package com.example.ln_20.retropost.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ln_20.retropost.model.DataResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ln-20 on 8/2/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 4;

    // Database Name
    private static final String DATABASE_NAME = "OrderResponse2";

    // Contacts table name
    private static final String TABLE_ORDERS = "getOrdersTable";

    // Contacts Table Columns names
    private static final String KEY_CONFIRM_ID = "confirm_id";
    private static final String KEY_PARK_NAME = "park_name";
    private static final String KEY_PARK_PH_NO = "park_phone_number";
    private static final String KEY_PARK_ADDRESS = "park_address";
    private static final String KEY_ORDER_TYPE = "order_type";
    private static final String KEY_PAYMENT = "payment";
    private static final String KEY_ORDER_STATUS = "order_status";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ORDERS_TABLE = "CREATE TABLE " + TABLE_ORDERS + "(" +
                KEY_CONFIRM_ID + " TEXT," +
                KEY_PARK_NAME + " TEXT," +
                KEY_PARK_PH_NO + " TEXT," +
                KEY_PARK_ADDRESS + " TEXT," +
                KEY_ORDER_TYPE + " TEXT," +
                KEY_PAYMENT + " TEXT," +
                KEY_ORDER_STATUS + " TEXT" + ")";

        db.execSQL(CREATE_ORDERS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ORDERS);

        // Create tables again
        onCreate(db);
    }

    // Adding order data
    public void addOrderData(DataResponse dataResponse) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(KEY_CONFIRM_ID, dataResponse.getData().getConfirmationId());
        values.put(KEY_PARK_NAME, dataResponse.getData().getParkName());
        values.put(KEY_PARK_PH_NO, dataResponse.getData().getParkPhone());
        values.put(KEY_PARK_ADDRESS, dataResponse.getData().getParkAddress());
        values.put(KEY_ORDER_TYPE, dataResponse.getData().getOrderType());
        values.put(KEY_PAYMENT, dataResponse.getData().getPaymentSource());
        values.put(KEY_ORDER_STATUS, dataResponse.getData().getOrderStatus());

        // Inserting Row
        db.insert(TABLE_ORDERS, null, values);
        db.close(); // Closing database connection
    }

    // Getting All Orders
    public List<DataResponse.Data> getAllOrder() {
        List<DataResponse.Data> dataResponseList = new ArrayList<DataResponse.Data>();

        String selectQuery = "SELECT * FROM " + TABLE_ORDERS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                DataResponse.Data dataRes = new DataResponse().new Data();
                dataRes.setConfirmationId(cursor.getString(0));
                dataRes.setParkName(cursor.getString(1));
                dataRes.setParkPhone(cursor.getString(2));
                dataRes.setParkAddress(cursor.getString(3));
                dataRes.setOrderType(cursor.getString(4));
                dataRes.setPaymentSource(cursor.getString(5));
                dataRes.setOrderStatus(cursor.getString(5));
                // Adding contact to list
                dataResponseList.add(dataRes);
            } while (cursor.moveToNext());
        }
        return dataResponseList;
    }
}
