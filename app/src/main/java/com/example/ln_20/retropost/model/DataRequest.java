package com.example.ln_20.retropost.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ln-20 on 7/2/17.
 */

public class DataRequest {

    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("txn_id")
        @Expose
        private String txnId;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getTxnId() {
            return txnId;
        }

        public void setTxnId(String txnId) {
            this.txnId = txnId;
        }

    }
}
