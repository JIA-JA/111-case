package com.system;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {

    // 以Singleton模式建立
    private static RetrofitManager mInstance = new RetrofitManager();

    private APIService APIService;

    private RetrofitManager() {

        // 設置baseUrl即要連的網站，addConverterFactory用Gson作為資料處理Converter
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://3e9f-2001-b400-e250-7e63-b8b9-15d4-3ae9-c520.jp.ngrok.io ")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService = retrofit.create(APIService.class);
    }

    public static RetrofitManager getInstance() {
        return mInstance;
    }

    public APIService getAPI() {
        return APIService;
    }
}

