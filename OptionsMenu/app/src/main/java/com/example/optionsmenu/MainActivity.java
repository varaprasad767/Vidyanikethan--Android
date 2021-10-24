package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.m1:
            {
                //Toast.makeText(getApplicationContext(), "settings selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "---" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "---");
                startActivity(Intent.createChooser(intent, "Contact Us!"));
                break;
            }
            case R.id.m2:
            {
                startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
               // Toast.makeText(getApplicationContext(), "whatsup web selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.m3:
            {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), "via selected", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.m4:
            {
                Toast.makeText(getApplicationContext(), "Account selected", Toast.LENGTH_SHORT).show();
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}