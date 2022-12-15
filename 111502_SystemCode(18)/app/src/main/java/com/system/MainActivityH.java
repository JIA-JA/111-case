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

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityH extends AppCompatActivity {

    APIService APIService;
    RecycleViewAdapter adapter;
    ArrayList<API3> search = new ArrayList<>();
    String resultPrice = "價位不限";
    String resultWay = "處理方法不限";
    String resultArea = "地區不限";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h);
        RecyclerView recyclerViewFilterResults = findViewById(R.id.recyclerViewFilterResultsH);
        recyclerViewFilterResults.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerViewFilterResults.addItemDecoration(new SpacesItemDecoration(20));
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
                resultPrice = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityH.this, resultPrice, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
        spinnerWay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                resultWay = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityH.this, resultWay, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
        spinnerArea.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                resultArea = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityH.this, resultArea, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
    }
    public void searchonClick(View v){
        System.out.println(resultPrice);
        System.out.println(resultWay);
        System.out.println(resultArea);
        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<List<API3>>> call= APIService.listExamples3();
        call.enqueue(new Callback<ResponseFormat<List<API3>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<API3>>> call, Response<ResponseFormat<List<API3>>> response) {
                System.out.println("connect ok");
                if(!response.body().getData().isEmpty()){
                    System.out.println(response.body().getData().size());
                    RecyclerView recyclerViewFilterResults = findViewById(R.id.recyclerViewFilterResultsH);
                    for(int i=0;i<response.body().getData().size();i++){
                        boolean status;
                        if(resultPrice == "價位不限"){
                            status = response.body().getData().get(i).getWay().contains(resultWay);
                            if(resultWay == "處理方法不限"){
                                status = response.body().getData().get(i).getAddress().contains(resultArea);
                                if(resultArea == "地區不限"){
                                    search.add(response.body().getData().get(i));
                                }else if(status){
                                    search.add(response.body().getData().get(i));
                                }
                            }else if(status){
                                status = response.body().getData().get(i).getAddress().contains(resultArea);
                                if(resultArea == "地區不限"){
                                    search.add(response.body().getData().get(i));
                                }else if(status){
                                    search.add(response.body().getData().get(i));
                                }
                            }
                        }else if(resultPrice == "5000(不含)以下"){
                            if(response.body().getData().get(i).getPrice()<5000){
                                status = response.body().getData().get(i).getWay().contains(resultWay);
                                if(resultWay == "處理方法不限"){
                                    status = response.body().getData().get(i).getAddress().contains(resultArea);
                                    if(resultArea == "地區不限"){
                                        search.add(response.body().getData().get(i));
                                    }else if(status){
                                        search.add(response.body().getData().get(i));
                                    }
                                }else if(status){
                                    status = response.body().getData().get(i).getAddress().contains(resultArea);
                                    if(resultArea == "地區不限"){
                                        search.add(response.body().getData().get(i));
                                    }else if(status){
                                        search.add(response.body().getData().get(i));
                                    }
                                }
                            }
                        }else if(resultPrice == "10000(不含)以上"){
                            if(response.body().getData().get(i).getPrice()>10000){
                                status = response.body().getData().get(i).getWay().contains(resultWay);
                                if(resultWay == "處理方法不限"){
                                    status = response.body().getData().get(i).getAddress().contains(resultArea);
                                    if(resultArea == "地區不限"){
                                        search.add(response.body().getData().get(i));
                                    }else if(status){
                                        search.add(response.body().getData().get(i));
                                    }
                                }else if(status){
                                    status = response.body().getData().get(i).getAddress().contains(resultArea);
                                    if(resultArea == "地區不限"){
                                        search.add(response.body().getData().get(i));
                                    }else if(status){
                                        search.add(response.body().getData().get(i));
                                    }
                                }
                            }
                        }else{
                            status = response.body().getData().get(i).getWay().contains(resultWay);
                            if(resultWay == "處理方法不限"){
                                status = response.body().getData().get(i).getAddress().contains(resultArea);
                                if(resultArea == "地區不限"){
                                    search.add(response.body().getData().get(i));
                                }else if(status){
                                    search.add(response.body().getData().get(i));
                                }
                            }else if(status){
                                status = response.body().getData().get(i).getAddress().contains(resultArea);
                                if(resultArea == "地區不限"){
                                    search.add(response.body().getData().get(i));
                                }else if(status){
                                    search.add(response.body().getData().get(i));
                                }
                            }
                        }
                    }
                    adapter = new RecycleViewAdapter(getApplicationContext(),search);
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