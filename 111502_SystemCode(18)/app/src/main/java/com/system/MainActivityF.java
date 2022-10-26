package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_f);
    }
    public void FAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityF.this, MainActivity.class);
        startActivity(intent);
    }
    public void FBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityF.this, MainActivityB.class);
        startActivity(intent);
    }
    public void FHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityF.this, MainActivityH.class);
        startActivity(intent);
    }
    public void FJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityF.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void FOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityF.this, MainActivityO.class);
        startActivity(intent);
    }
}