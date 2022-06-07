package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_k);
    }
    public void KAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityK.this, MainActivity.class);
        startActivity(intent);
    }
    public void KBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityK.this, MainActivityB.class);
        startActivity(intent);
    }
    public void KHonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityK.this, MainActivityH.class);
        startActivity(intent);
    }
    public void KJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityK.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void KOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityK.this, MainActivityO.class);
        startActivity(intent);
    }

    public void backonClick(View v) {
        MainActivityK.this.finish();
    }
}