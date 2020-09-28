package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoveWithDataActivity extends AppCompatActivity {


    public static final String EXTRA_NAME = "";
    public static final Object EXTRA_AGE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        val tvDataReceived = null;View TextView = findViewById(R.id.tv_data_received);
        Intent intent = null;
        String name = intent.getStringExtra(EXTRA_NAME);
        int age = intent.getIntExtra((String) EXTRA_AGE, 0);
        String text = "Name : $name, Your Age : $age";
        tvDataReceived.text = text;
    }
}
