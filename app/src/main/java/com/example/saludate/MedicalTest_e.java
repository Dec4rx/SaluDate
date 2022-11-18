package com.example.saludate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MedicalTest_e extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_test_e);
    }

    public void next_e1(){
        Intent act = new Intent(MedicalTest_e.this, AddTest_e.class);
        startActivity(act);
    }
}