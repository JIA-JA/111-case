package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
    }
    public void BAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivity.class);
        startActivity(intent);
    }

    public void BHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivityH.class);
        startActivity(intent);
    }
    public void BJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void BOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivityO.class);
        startActivity(intent);
    }
}