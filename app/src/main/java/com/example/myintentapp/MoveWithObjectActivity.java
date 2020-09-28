package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final Object EXTRA_PERSON = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        val tvDataReceived = null;
        View TextView = findViewById(R.id.tv_object_received);

        Intent intent = null;
        val person = intent.getParcelableExtra((String) EXTRA_PERSON);
        val text = "Name : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
        val tvObject = null;
        tvObject.text = String.valueOf(text);
    }
    }