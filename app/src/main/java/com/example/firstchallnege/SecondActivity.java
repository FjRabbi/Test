package com.example.firstchallnege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.goToBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("https://wegrapps.com/");
                intent.setData(uri);
                startActivity(intent);*/

                Intent intent = new Intent(SecondActivity.this, LogIn.class);
                startActivity(intent);


            }
        });
    }
}