package com.example.ln_20.retropost.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.ln_20.retropost.R;
import com.example.ln_20.retropost.api.ApiFactory;
import com.example.ln_20.retropost.api.ApiInterface;
import com.example.ln_20.retropost.database.DatabaseHelper;
import com.example.ln_20.retropost.model.DataRequest;
import com.example.ln_20.retropost.model.DataResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.List;

import okhttp3.MediaType;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    DataResponse dataResponse;
    DataResponse.Data data;
    DataRequest dataRequest;
    DataRequest.Data dataReq;
    DatabaseHelper databaseHelper;
    private final String TAG = MainActivity.class.getName();
    TextView txtConfirm, txtParkName, txtParkPhone, txtParkAddres, txtOrderType, txtPaymentSource, txtOrderStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtConfirm = (TextView) findViewById(R.id.txtConfirm);
        txtParkName = (TextView) findViewById(R.id.txtParkName);
        txtParkPhone = (TextView) findViewById(R.id.txtParkPhone);
        txtParkAddres = (TextView) findViewById(R.id.txtParkAddres);
        txtOrderType = (TextView) findViewById(R.id.txtOrderType);
        txtOrderStatus = (TextView) findViewById(R.id.txtOrderStatus);
        txtPaymentSource = (TextView) findViewById(R.id.txtPaymentSource);

        dataResponse = new DataResponse();
        data = new DataResponse().new Data();
        dataRequest = new DataRequest();
        dataReq = new DataRequest().new Data();
        databaseHelper = new DatabaseHelper(this);

        dataReq.setTxnId("350708");
        dataReq.setType("parking");
        dataReq.setUserId("40");
        dataRequest.setData(dataReq);

        ApiInterface apiInterface = ApiFactory.provideRestAdapter()
                .create(ApiInterface.class);

        Call<DataResponse> call = apiInterface.getApiResponse(dataRequest);


        call.enqueue(new Callback<DataResponse>() {

            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {

                if (response.isSuccessful()) {

                    databaseHelper.addOrderData(response.body());

                    List<DataResponse.Data> orderList = databaseHelper.getAllOrder();

                    for (DataResponse.Data cn : orderList) {

                        txtConfirm.setText(cn.getConfirmationId());
                        txtParkName.setText(cn.getParkName());
                        txtParkPhone.setText(cn.getParkPhone());
                        txtParkAddres.setText(cn.getParkAddress());
                        txtOrderType.setText(cn.getOrderType());
                        txtOrderStatus.setText(cn.getOrderStatus());
                        txtPaymentSource.setText(cn.getPaymentSource());

                    }
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {

            }
        });
    }
}
