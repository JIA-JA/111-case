package com.system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivityP extends AppCompatActivity {

    Boolean firstTime = true ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p);

        Spinner spinnerA = (Spinner) findViewById(R.id.spinnerPetGenderP);
        Spinner spinnerB = (Spinner) findViewById(R.id.spinnerPetLigationP);

        ArrayAdapter<CharSequence> adapterA =
                ArrayAdapter.createFromResource(this,
                        R.array.petGender,
                        android.R.layout.simple_dropdown_item_1line);

        adapterA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerA.setAdapter(adapterA);
        spinnerA.setSelection(0, false);
        spinnerA.setOnItemSelectedListener(spnOnItemSelected);

        ArrayAdapter<CharSequence> adapterB =
                ArrayAdapter.createFromResource(this,
                        R.array.petLigation,
                        android.R.layout.simple_dropdown_item_1line);

        adapterB.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerB.setAdapter(adapterB);
        spinnerB.setSelection(0, false);
        spinnerB.setOnItemSelectedListener(spnOnItemSelected);

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

    public void backonClick(View v) {
        MainActivityP.this.finish();
    }

    private AdapterView.OnItemSelectedListener spnOnItemSelected= new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view,int pos, long id) {
            if (firstTime){firstTime = false;}
            else{
                Toast.makeText(view.getContext(),parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }
        }
        public void onNothingSelected(AdapterView<?> parent) {
            //
        }
    };

}