package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_l);
    }
    public void LAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityL.this, MainActivity.class);
        startActivity(intent);
    }
    public void LBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityL.this, MainActivityB.class);
        startActivity(intent);
    }
    public void LHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityL.this, MainActivityH.class);
        startActivity(intent);
    }
    public void LJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityL.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void LOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityL.this, MainActivityO.class);
        startActivity(intent);
    }
    public void BackonClick(View v) {
        finish();
    }
}