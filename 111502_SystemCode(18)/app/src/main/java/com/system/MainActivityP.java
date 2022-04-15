package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p);
    }
    public void PAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityP.this, MainActivity.class);
        startActivity(intent);
    }
    public void PBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityP.this, MainActivityB.class);
        startActivity(intent);
    }
    public void PHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityP.this, MainActivityH.class);
        startActivity(intent);
    }
    public void PJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityP.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void POonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityP.this, MainActivityO.class);
        startActivity(intent);
    }
}