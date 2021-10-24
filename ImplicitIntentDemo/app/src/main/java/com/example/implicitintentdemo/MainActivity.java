package com.example.implicitintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.google).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri=Uri.parse("http://www.google.com");

                Intent i=new Intent(Intent.ACTION_VIEW,uri);

                startActivity(i);

            }
        });

        findViewById(R.id.call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri call=Uri.parse("tel:9848431016");
                Intent i=new Intent(Intent.ACTION_DIAL,call);
                startActivity(i);

            }
        });
    }
}