package com.example.firstchallnege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnHistoricalSketch extends AppCompatActivity {

    Button backBtn1st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an_historical_sketch);

        backBtn1st = findViewById(R.id.backBtn1st);
        backBtn1st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AnHistoricalSketch.this, Book.class);
                startActivity(intent);
            }
        });
    }
}