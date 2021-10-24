package com.example.hellotoastcount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button msg;

    TextView tv_res;

    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=findViewById(R.id.countmsg);
        tv_res=findViewById(R.id.res);


        if (savedInstanceState!=null && savedInstanceState.containsKey("key"))
        {
            c=savedInstanceState.getInt("key");
            tv_res.setText(""+c);
        }




        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                tv_res.setText(""+c);
                //Toast.makeText(MainActivity.this,"Gopal",Toast.LENGTH_LONG).show();
            }
        });




    }

    public void toastmsg(View view)
    {
     Toast.makeText(this,"Gopal",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key",c);
    }
}