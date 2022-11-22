package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_e);
    }
    public void BackonClick(View v) {
        finish();
    }
    public void EAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityE.this, MainActivity.class);
        startActivity(intent);
    }
    public void EBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityE.this, MainActivityB.class);
        startActivity(intent);
    }
    public void EHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityE.this, MainActivityH.class);
        startActivity(intent);
    }
    public void EJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityE.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void EOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityE.this, MainActivityO.class);
        startActivity(intent);
    }
}