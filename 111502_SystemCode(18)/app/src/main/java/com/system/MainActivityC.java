package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.system.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityC extends AppCompatActivity {

    APIService APIService;
    RecycleViewAdapter adapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main_c);

        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                System.out.println(response.body().getData());
                if(!response.body().getData().isEmpty()){
                    System.out.println(response.body().getData().size());
//                    for (API2:response.body().getData()
//                         ) {
//                        System.out.println(response.body().getData());
//                    }
                }
            }
            @Override
            public void onFailure(Call<ResponseFormat<List<API2>>> call, Throwable t) {
                System.out.println("fail");
                t.fillInStackTrace();
                System.out.println(t.getMessage());
            }
        });
    }
    public void CAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityC.this, MainActivity.class);
        startActivity(intent);
    }
    public void CBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityC.this, MainActivityB.class);
        startActivity(intent);
    }
    public void CHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityC.this, MainActivityH.class);
        startActivity(intent);
    }
    public void CJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityC.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void COonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityC.this, MainActivityO.class);
        startActivity(intent);
    }
}