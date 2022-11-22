package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);
    }
    public void BackonClick(View v) {
        finish();
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