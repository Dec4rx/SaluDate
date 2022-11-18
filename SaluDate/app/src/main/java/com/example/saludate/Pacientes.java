package com.example.saludate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Pacientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pacientes);

        FloatingActionButton button = findViewById(R.id.fab_patientAdd);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_addPatient;
                intent_addPatient = new Intent(v.getContext(), RegisterType.class);
                startActivity(intent_addPatient);
            }
        });

        Button patient_1 = findViewById(R.id.btn_patient_001);
        patient_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent individual = new Intent(v.getContext(), PacienteInfo.class);
                startActivity(individual);
            }
        });

    }
}