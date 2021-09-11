package com.example.firstchallnege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    EditText fullNameTxt;
    EditText phoneNoTxt;
    EditText sectionTxt;
    EditText idTxt;
    Button createBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        fullNameTxt = findViewById(R.id.fullNameTxt);
        phoneNoTxt = findViewById(R.id.phoneNoTxt);
        sectionTxt = findViewById(R.id.sectionTxt);
        idTxt = findViewById(R.id.idTxt);


        //Toast.makeText(CreateAccount.this, "Full Name: "+fullName, Toast.LENGTH_LONG).show();

        createBtn = findViewById(R.id.createBtn);
        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fullName = fullNameTxt.getText().toString();
                String phone = phoneNoTxt.getText().toString();
                String section = sectionTxt.getText().toString();
                String id = idTxt.getText().toString();

                Intent intent = new Intent(CreateAccount.this, StudentInfo.class); //getApplicationContext()
                intent.putExtra("Name", fullNameTxt.getText().toString());
                intent.putExtra("Phone", phoneNoTxt.getText().toString());
                intent.putExtra("Id", idTxt.getText().toString());
                intent.putExtra("Section", sectionTxt.getText().toString());

                startActivity(intent);

//                Toast.makeText(CreateAccount.this, "Full Name: ", Toast.LENGTH_LONG).show();

            }
        });


    }
}