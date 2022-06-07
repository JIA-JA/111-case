package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_g);
    }
    public void GAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivity.class);
        startActivity(intent);
    }
    public void GBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityB.class);
        startActivity(intent);
    }
    public void GHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityH.class);
        startActivity(intent);
    }
    public void GJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void GOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityG.this, MainActivityO.class);
        startActivity(intent);
    }

    public void backonClick(View v) {
        MainActivityG.this.finish();
    }
}