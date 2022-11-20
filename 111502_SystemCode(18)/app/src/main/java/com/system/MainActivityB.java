package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

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

    public void BConClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivityC.class);
        startActivity(intent);
    }

    public void BEonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivityE.class);
        startActivity(intent);
    }

    public void BGonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityB.this, MainActivityG.class);
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