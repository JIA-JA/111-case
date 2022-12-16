package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivityJ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_j);

        Spinner spinnerVarietyJ = findViewById(R.id.spinnerVarietyJ);
        spinnerVarietyJ.setSelection(0, false);

        // 設定 sp 元件 ItemSelected 事件的 listener
        spinnerVarietyJ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityJ.this, result, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });

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

    public void JKonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityJ.this, MainActivityK.class);
        startActivity(intent);
    }
}