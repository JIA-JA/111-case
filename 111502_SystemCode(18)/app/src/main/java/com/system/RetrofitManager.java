package com.system;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    // 以Singleton模式建立
    private static RetrofitManager mInstance = new RetrofitManager();

    private ExampleService exampleService;

    private RetrofitManager() {

        // 設置baseUrl即要連的網站，addConverterFactory用Gson作為資料處理Converter
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://fd73-211-21-101-140.jp.ngrok.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        exampleService = retrofit.create(ExampleService.class);
    }

    public static RetrofitManager getInstance() {
        return mInstance;
    }

    public ExampleService getAPI() {
        return exampleService;
    }
}

