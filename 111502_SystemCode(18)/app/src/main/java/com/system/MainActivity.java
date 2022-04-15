package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ABonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityB.class);
        startActivity(intent);
    }
    public void AHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityH.class);
        startActivity(intent);
    }
    public void AJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void AOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivityO.class);
        startActivity(intent);
    }
}