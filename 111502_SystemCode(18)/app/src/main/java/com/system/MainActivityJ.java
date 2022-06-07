package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityJ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_j);
    }
    public void JAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityJ.this, MainActivity.class);
        startActivity(intent);
    }
    public void JBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityJ.this, MainActivityB.class);
        startActivity(intent);
    }
    public void JHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityJ.this, MainActivityH.class);
        startActivity(intent);
    }

    public void JOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityJ.this, MainActivityO.class);
        startActivity(intent);
    }

    public void JLonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityJ.this, MainActivityL.class);
        startActivity(intent);
    }

}