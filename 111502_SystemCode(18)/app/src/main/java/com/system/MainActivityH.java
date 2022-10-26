package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h);
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