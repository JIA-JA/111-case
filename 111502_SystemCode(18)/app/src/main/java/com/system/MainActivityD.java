package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_d);
    }
    public void DAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityD.this, MainActivity.class);
        startActivity(intent);
    }
    public void DBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityD.this, MainActivityB.class);
        startActivity(intent);
    }
    public void DHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityD.this, MainActivityH.class);
        startActivity(intent);
    }
    public void DJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityD.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void DOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityD.this, MainActivityO.class);
        startActivity(intent);
    }

    public void backonClick(View v) {
        MainActivityD.this.finish();
    }
}