package com.example.dataparsingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=findViewById(R.id.tv_res);

       String e= getIntent().getStringExtra("gopal");

       tv.setText(e);
    }
}