package com.example.firstchallnege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Book extends AppCompatActivity {

    Button anHistoricalSketchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        anHistoricalSketchBtn = findViewById(R.id.anHistoricalSketchBtn);
        anHistoricalSketchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Book.this,AnHistoricalSketch.class);
                startActivity(intent);
            }
        });


    }
}