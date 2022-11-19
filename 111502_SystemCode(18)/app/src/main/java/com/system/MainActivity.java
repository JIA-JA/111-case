package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.system.databinding.ActivityMainBinding;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ExampleService exampleService;
    RecycleViewAdapter adapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TextView textView = findViewById(R.id.textViewTextA1);

        exampleService=RetrofitManager.getInstance().getAPI();

        Call<ResponseFormat<List<Example>>> call=exampleService.listExamples();
        call.enqueue(new Callback<ResponseFormat<List<Example>>>() {
            @Override
            public void onResponse(Call<ResponseFormat<List<Example>>> call, Response<ResponseFormat<List<Example>>> response) {
                System.out.println("connect ok");
                System.out.println(response.body().getData());
                if(!response.body().getData().isEmpty()){
                    System.out.println(response.body().getData().size());
                    RecyclerView recyclerView = findViewById(R.id.recyclerView);
                    adapter = new RecycleViewAdapter(getApplicationContext(), response.body().getData());
                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    recyclerView.setAdapter(adapter);
                    textView.setText(adapter.toString());
                    }
                }
            @Override
            public void onFailure(Call<ResponseFormat<List<Example>>> call, Throwable t) {
                System.out.println("fail");
                t.fillInStackTrace();
                System.out.println(t.getMessage());
            }
        });
    }

    public void ABonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityB.class);
        startActivity(intent);
    }
    public void AHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityH.class);
        startActivity(intent);
    }
    public void AJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void AOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityO.class);
        startActivity(intent);
    }
}