package com.example.farmerapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiController {
    private static final String url="http://127.0.0.1:8000/";
    private static apiController clientobject;
    private static Retrofit retrofit;
    apiController(){
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized apiController getInstance(){
        if(clientobject==null)
            clientobject= new apiController();
        return clientobject;
    }
    apiset getapi(){
        return retrofit.create(apiset.class);
    }
}
