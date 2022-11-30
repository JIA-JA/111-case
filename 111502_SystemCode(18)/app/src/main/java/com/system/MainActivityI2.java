package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityI2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_i2);
        TextView textView = findViewById(R.id.textViewTextI2);
        textView.setText("樹葬就是將火化後的骨灰經過研磨處理，" +
                "裝入可被大自然分解的紙或棉布袋內，" +
                "不立墓碑，也不記姓名，" +
                "存放於樹木的根部或拋灑在特定區域的花園或草坪上，" +
                "讓寵物死後與自然合而為一。" +
                "樹葬不占用土地空間，" +
                "也有助於環境的綠化，" +
                "這樣的殯葬處理方式在一些先進國家逐漸風行。");
    }
    public void BackonClick(View v) {
        finish();
    }
    public void IAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI2.this, MainActivity.class);
        startActivity(intent);
    }
    public void IBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI2.this, MainActivityB.class);
        startActivity(intent);
    }
    public void IJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI2.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void IOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI2.this, MainActivityO.class);
        startActivity(intent);
    }
}