package com.rathoreraja.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class secondActivity extends AppCompatActivity {




    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();

        String title = fromAct.getStringExtra("title");

        String studentName = fromAct.getStringExtra("StudentName");

        int rollNo = fromAct.getIntExtra("RollNo", 0);

        TextView txtStudentInfo;
        txtStudentInfo = findViewById(R.id.txtStudentInfo);


       txtStudentInfo.setText("Name: "+studentName+", RollNo: "+rollNo);

       Objects.requireNonNull(getSupportActionBar()).setTitle(title);

    }
}