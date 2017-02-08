package com.example.ln_20.retropost.api;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ln-20 on 7/2/17.
 */

public class ApiFactory {
    public ApiFactory() {
    }

    private static final String BASE_URL = "http://bi.way.com/responsive/mobiwebservice/";

    @NonNull
    public static Retrofit provideRestAdapter() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
