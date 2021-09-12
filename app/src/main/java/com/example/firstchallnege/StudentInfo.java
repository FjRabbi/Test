package com.example.firstchallnege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentInfo extends AppCompatActivity {

    TextView nameShowTxt;
    TextView idShowTxt;
    TextView sectionShowTxt;
    TextView phoneShowTxt;
    Button closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        nameShowTxt = findViewById(R.id.nameShowTxt);
        idShowTxt = findViewById(R.id.idShowTxt);
        sectionShowTxt = findViewById(R.id.sectionShowTxt);
        phoneShowTxt = findViewById(R.id.phoneShowTxt);
        closeBtn = findViewById(R.id.closeBtn);

        Intent intent = getIntent();

        String fullName = intent.getStringExtra("Name");
        String phone = intent.getStringExtra("Phone");
        String section = intent.getStringExtra("Id");
        String id = intent.getStringExtra("Section");

        nameShowTxt.setText("Name: "+fullName);
        idShowTxt.setText("ID: "+id);
        sectionShowTxt.setText("Section: "+section);
        phoneShowTxt.setText("Phone: "+phone);

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StudentInfo.this, MainActivity.class);
            }
        });


    }
}