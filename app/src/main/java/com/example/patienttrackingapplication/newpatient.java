package com.example.patienttrackingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class newpatient extends AppCompatActivity {

    EditText name, disease, medication, time;

    Button ebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpatient);

        name = findViewById(R.id.ename);
        disease = findViewById(R.id.edis);
        medication = findViewById(R.id.emedication);
        time = findViewById(R.id.etime);
        ebtn = findViewById(R.id.ebtn);

        ebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pintent = Intent(newpatient.this, )
            }
        });




    }
}