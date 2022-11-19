package com.system;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ExampleService {
    @GET("API")
    Call<com.system.ResponseFormat<List<com.system.Example>>> listExamples();

    @POST("example") // 用@Body表示要傳送Body資料
    Call<com.system.Example> postExample(@Body com.system.Example example);
}