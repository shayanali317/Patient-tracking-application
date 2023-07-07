package com.example.patienttrackingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class patientdata extends AppCompatActivity {

    Button newbtn1;
    Button oldbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdata);

        oldbtn1 = findViewById(R.id.oldbtn);
        oldbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oldintent = new Intent(patientdata.this, oldpatient.class);
                startActivity(oldintent);
            }
        });

        newbtn1 = findViewById(R.id.newbtn);
        newbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(patientdata.this, newpatient.class);
                startActivity(newintent);
            }
        });
    }
}