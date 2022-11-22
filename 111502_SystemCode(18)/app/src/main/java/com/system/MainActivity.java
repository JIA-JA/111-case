package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIService APIService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textViewUserNameA1);
        TextView textView2 = findViewById(R.id.textViewTagA1);
        TextView textView3 = findViewById(R.id.textViewTextA1);
        TextView textView4 = findViewById(R.id.textViewGreatNumA1);

        APIService =RetrofitManager.getInstance().getAPI();
        Call<ResponseFormat<API1>> call= APIService.listExamples1();
        call.enqueue(new Callback<ResponseFormat<API1>>() {
            @Override
            public void onResponse(Call<ResponseFormat<API1>> call, Response<ResponseFormat<API1>> response) {
                System.out.println("connect ok");
                System.out.println(response.body().getData());
                if(response.body().getData()!=null){
                    textView1.setText(response.body().getData().getUser_name());
                    textView2.setText(response.body().getData().getTag_());
                    textView3.setText(response.body().getData().getContent());
                    String string4 = Integer.toString(response.body().getData().getLike_num());
                    textView4.setText(string4);
                    }
                }
            @Override
            public void onFailure(Call<ResponseFormat<API1>> call, Throwable t) {
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