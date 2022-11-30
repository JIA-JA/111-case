package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m);
    }
    public void BackonClick(View v) {
        finish();
    }

    public void MNonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityM.this, MainActivityN.class);
        startActivity(intent);
    }
}