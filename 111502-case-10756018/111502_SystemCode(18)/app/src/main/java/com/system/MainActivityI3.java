package com.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityI3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_i3);
        TextView textView = findViewById(R.id.textViewTextI3);
        textView.setText("海葬是最環保且節省土地資源的殯葬方式，" +
                "是將亡者火化之骨灰再處理(研磨)後用「環保棉紙袋」盛裝，" +
                "置放於「安息盒」中，" +
                "當船行駛至港口防波堤最外端向外延伸6,000公尺之海域，" +
                "由家屬先對先行者告別祈福，" +
                "再將「安息盒」 伴隨鮮花及花瓣拋灑入海，" +
                "於眾人默禱下，目送骨灰沉入海中。");
    }
    public void BackonClick(View v) {
        finish();
    }
    public void IAonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI3.this, MainActivity.class);
        startActivity(intent);
    }
    public void IBonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI3.this, MainActivityB.class);
        startActivity(intent);
    }
    public void IJonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI3.this, MainActivityJ.class);
        startActivity(intent);
    }
    public void IOonClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivityI3.this, MainActivityO.class);
        startActivity(intent);
    }
}