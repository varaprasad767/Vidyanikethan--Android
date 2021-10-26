package com.example.dialoguesandpickers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int c_year,c_month,c_day;

    int c_hour,c_min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.time).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar c=Calendar.getInstance();
                c_hour=c.get(Calendar.HOUR);
                c_min=c.get(Calendar.MINUTE);

                TimePickerDialog tp=new
                        TimePickerDialog(MainActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                                Toast.makeText(MainActivity.this,
                                        "The Time Is"+i+":"+i1,Toast.LENGTH_LONG).show();
                            }
                        },c_hour,c_min,true);
                tp.show();

            }
        });




        findViewById(R.id.date).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar c=Calendar.getInstance();
                c_year=c.get(Calendar.YEAR);
                c_month=c.get(Calendar.MONTH);
                c_day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dp=new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                        Toast.makeText(MainActivity.this,
                                "The Date:"+i+"/"+(i1+1)+"/"+i2,
                                Toast.LENGTH_LONG).show();

                    }
                },c_year,c_month,c_day);

                dp.show();
            }
        });
    }

    public void alertdialogu(View view) {
        AlertDialog.Builder builder = new
                AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Alert");
        builder.setMessage("Do You Want Close this App");
        builder.setIcon(R.drawable.alert);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();

            }
        });

        builder.show();

    }
}