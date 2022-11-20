package com.system;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {
    @GET("API1")
    Call<com.system.ResponseFormat<API1>> listExamples1();

    @GET("API2")
    Call<com.system.ResponseFormat<List<API2>>> listExamples2();

    @POST("API1") // 用@Body表示要傳送Body資料
    Call<API1> postExample(@Body API1 API1);
}