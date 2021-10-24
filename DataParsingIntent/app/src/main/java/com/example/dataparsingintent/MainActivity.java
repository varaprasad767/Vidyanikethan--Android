package com.example.dataparsingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=findViewById(R.id.et_msg);
        findViewById(R.id.senddata).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String m=  msg.getText().toString();
                Intent se=new Intent(MainActivity.this,
                        Second.class);
                se.putExtra("gopal",m);
                startActivity(se);

            }
        });
    }
}