package com.example.patienttrackingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn = findViewById(R.id.btn1);
        Btn.setOnClickListener(v -> {

            Intent menuIntent = new Intent(MainActivity.this, patientdata.class);
            startActivity(menuIntent);
        });
    }
}