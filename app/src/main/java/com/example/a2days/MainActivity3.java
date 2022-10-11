package com.example.a2days;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button registerbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        registerbtn=findViewById(R.id.explorefood);
        registerbtn.setOnClickListener

    }
}