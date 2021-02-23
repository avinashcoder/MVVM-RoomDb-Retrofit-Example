package com.learn.architectureexample.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitInstance {

    public static String BASE_URL = "https://demo6891367.mockable.io/";

    public static Retrofit retrofit;

    public static  Retrofit getRetrofitClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
