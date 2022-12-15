package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityG extends AppCompatActivity {

    APIService APIService;
    int i=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_g);

        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void VaccineNoticeonClick(View v){
        i=4;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void PreventionNoticeonClick(View v){
        i=6;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void SummerNoticeonClick(View v){
        i=1;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void AutumnWinterNoticeonClick(View v){
        i=5;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void WaferNoticeonClick(View v){
        i=3;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void WeightControlonClick(View v){
        i=7;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void HealthNoticeonClick(View v){
        i=0;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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
    public void PetDentistryonClick(View v){
        i=2;
        TextView textView1 = findViewById(R.id.textViewTitleG);
        TextView textView2 = findViewById(R.id.textViewTextG);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API2>>> call= APIService.listExamples2();
        call.enqueue(new Callback<ResponseFormat<List<API2>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API2>>> call, Response<ResponseFormat<List<API2>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    textView1.setText(response.body().getData().get(i).getMust_know_name());
                    textView2.setText(response.body().getData().get(i).getMust_know_describe());
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