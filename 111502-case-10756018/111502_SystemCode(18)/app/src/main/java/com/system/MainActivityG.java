package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityG extends AppCompatActivity {

    APIService APIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_g);
        TextView textView = findViewById(R.id.textViewTextG);

        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<API2>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<API2>>() {
            @Override
            public void onResponse(Call<ResponseFormat<API2>> call, Response<ResponseFormat<API2>> response) {
                System.out.println("connect ok");
                if(response.body().getData()!=null){
                    System.out.println(response.body().getData().getMust_know_describe());
                    textView.setText(response.body().getData().getMust_know_describe());

                }
            }
            @Override
            public void onFailure(Call<ResponseFormat<API2>> call, Throwable t) {
                System.out.println("fail");
                t.fillInStackTrace();
                System.out.println(t.getMessage());
            }
        });

    }
    public void BackonClick(View v) {
        finish();
    }
    public void GAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivity.class);
        startActivity(intent);
    }
    public void GBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityB.class);
        startActivity(intent);
    }
    public void GHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityH.class);
        startActivity(intent);
    }
    public void GJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void GOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityO.class);
        startActivity(intent);
    }
}