package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView textView;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       super.onOptionsItemSelected(item);
       switch(item.getItemId())
       {
           case R.id.eng:
               textView.setText("English");
               return true;
           case R.id.hin:
               textView.setText("Hindi");
               return true;
           case R.id.raj:
               textView.setText("Rajasthani");
               return true;
           case R.id.frn:
               textView.setText("French");
               return true;
           case R.id.san:
               textView.setText("Sanskrit");
               return true;
           default:
               return true;
       }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
    }
}