package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_i);
    }
    public void IAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI.this, MainActivity.class);
        startActivity(intent);
    }
    public void IBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI.this, MainActivityB.class);
        startActivity(intent);
    }
    public void IHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI.this, MainActivityH.class);
        startActivity(intent);
    }
    public void IJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void IOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI.this, MainActivityO.class);
        startActivity(intent);
    }
}