package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p);
        Spinner spinnerPetGender = findViewById(R.id.spinnerPetGenderP);
        Spinner spinnerPetLigation = findViewById(R.id.spinnerPetLigationP);
        spinnerPetGender.setSelection(1, false);
        spinnerPetLigation.setSelection(1, false);

        // 設定 sp 元件 ItemSelected 事件的 listener
        spinnerPetGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityP.this, result, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });
        spinnerPetLigation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String result = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivityP.this, result, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });

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
    public void BackonClick(View v) {
        finish();
    }
}