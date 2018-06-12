package com.emulatorBank.core;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitBuilder {

    private static Retrofit INSTANCE;

    public static Retrofit getInstance(String urladdress) {
        if (INSTANCE == null) {
            synchronized (Retrofit.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Retrofit.Builder()
                            //.baseUrl("http://90.188.7.43:8080/")
                            .baseUrl(urladdress)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}