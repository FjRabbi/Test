package com.example.firstchallnege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    TextView helloTxt;
    Button done;
    Image teslaImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloTxt = findViewById(R.id.helloTxt);

        done = findViewById(R.id.btn1);

        //done.setText("Click Me");

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //helloTxt.setText("I am changed");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        helloTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                helloTxt.setBackgroundColor(getResources().getColor(R.color.green));
                Toast.makeText(MainActivity.this, "I am Tiralex.",Toast.LENGTH_LONG).show();
            }
        });
    }
}