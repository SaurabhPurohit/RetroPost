package com.example.ln_20.retropost.api;

import android.util.Log;

import com.example.ln_20.retropost.model.DataRequest;
import com.example.ln_20.retropost.model.DataResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ln-20 on 7/2/17.
 */

public interface ApiInterface {
    @POST("api/get_order_details.php")
    Call<DataResponse> getApiResponse(@Body DataRequest dataRequest);
}
