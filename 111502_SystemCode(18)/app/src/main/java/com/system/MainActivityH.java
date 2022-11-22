package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityH extends AppCompatActivity {

    APIService APIService;
    RecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h);

        Spinner spinnerPrice = findViewById(R.id.spinnerPriceH);
        Spinner spinnerWay = findViewById(R.id.spinnerWayH);
        Spinner spinnerArea = findViewById(R.id.spinnerAreaH);
        spinnerPrice.setSelection(0, false);
        spinnerWay.setSelection(0, false);
        spinnerArea.setSelection(0, false);

        // 設定 sp 元件 ItemSelected 事件的 listener
        spinnerPrice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityH.this, result, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
        spinnerWay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityH.this, result, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
        spinnerArea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityH.this, result, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });


    }
    public void searchonClick(View v){
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API3>>> call= APIService.listExamples3();
        call.enqueue(new Callback<ResponseFormat<List<API3>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API3>>> call, Response<ResponseFormat<List<API3>>> response) {
                System.out.println("connect ok");
                System.out.println(response.body().getData());
                if(!response.body().getData().isEmpty()){
                    System.out.println(response.body().getData().size());
                    RecyclerView recyclerViewFilterResults = findViewById(R.id.recyclerViewFilterResultsH);
                    adapter = new RecycleViewAdapter(getApplicationContext(), response.body().getData());
                    recyclerViewFilterResults.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerViewFilterResults.addItemDecoration(new SpacesItemDecoration(30));
                    recyclerViewFilterResults.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<ResponseFormat<List<API3>>> call, Throwable t) {
                System.out.println("fail");
                t.fillInStackTrace();
                System.out.println(t.getMessage());
            }
        });
    }
    public void HAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivity.class);
        startActivity(intent);
    }
    public void HBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivityB.class);
        startActivity(intent);
    }
    public void HI1onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivityI1.class);
        startActivity(intent);
    }
    public void HI2onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivityI2.class);
        startActivity(intent);
    }
    public void HI3onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivityI3.class);
        startActivity(intent);
    }
    public void HJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void HOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityH.this, MainActivityO.class);
        startActivity(intent);
    }
}