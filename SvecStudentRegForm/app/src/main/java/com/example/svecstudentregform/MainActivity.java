package com.example.svecstudentregform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,colege,email,mobile,pincode,village;

    TextView textView;

    RadioButton ma,f;

    Spinner dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.res);
        name=findViewById(R.id.et_sname);
        colege=findViewById(R.id.et_college);
        email=findViewById(R.id.et_email);
        mobile=findViewById(R.id.et_phone);
        pincode=findViewById(R.id.et_pin);
        village=findViewById(R.id.et_village);
        ma=findViewById(R.id.r1);
        f=findViewById(R.id.r2);

        dis=findViewById(R.id.sp_distict);

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String n= name.getText().toString();
              String c= colege.getText().toString();
              String e=email.getText().toString();
              String m= mobile.getText().toString();
              String p= pincode.getText().toString();
              String v=village.getText().toString();

              StringBuilder sb=new StringBuilder();

              if (ma.isChecked())
              {
                sb.append(""+ma.getText().toString());
              }
              if (f.isChecked())
              {
                  sb.append(""+f.getText().toString());
              }

              String district=dis.getSelectedItem().toString();


              textView.setText(""+n+"\n"+c+"\n"+e+"\n"+m+"\n"+p+"\n"+v+"\n"+sb+"\n"+district);
            }
        });
    }
}