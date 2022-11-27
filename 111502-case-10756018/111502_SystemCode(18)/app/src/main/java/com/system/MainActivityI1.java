package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityI1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_i1);
        TextView textView = findViewById(R.id.textViewTextI1);
        textView.setText("寵物火化方式與人類大致相同:  \n" +
                "‧ 選擇日期：挑選欲火化與下葬的吉日。  \n" +
                "‧ 告別式：寵物火化前會舉辦告別式，讓飼主追思道別。  \n" +
                "‧ 火化與撿骨：將大體移至火化爐進行寵物火化儀式與撿骨。  \n" +
                "‧ 進塔：將骨灰裝入骨灰罈內保存，進入塔位安厝。寵物火化方式與人類大致相同:  \n" +
                "‧ 選擇日期：挑選欲火化與下葬的吉日。  \n" +
                "‧ 告別式：寵物火化前會舉辦告別式，讓飼主追思道別。  \n" +
                "‧ 火化與撿骨：將大體移至火化爐進行寵物火化儀式與撿骨。  \n" +
                "‧ 進塔：將骨灰裝入骨灰罈內保存，進入塔位安厝。");
    }
    public void BackonClick(View v) {
        finish();
    }
    public void IAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI1.this, MainActivity.class);
        startActivity(intent);
    }
    public void IBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI1.this, MainActivityB.class);
        startActivity(intent);
    }
    public void IJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI1.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void IOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI1.this, MainActivityO.class);
        startActivity(intent);
    }
}