package com.example.myintentapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MoveActivity<override> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
    }
} 