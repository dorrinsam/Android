package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {
    TextView rules;
    CheckBox accept;

    @Override
       protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_sixth);

         //مربوط به قوانین و مقررات را میپذیرم
         accept = findViewById(R.id.accept);
         CheckBox accept = (CheckBox) findViewById(R.id.accept);
         accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SixthActivity.this, FifthActivity.class));
            }
        });


        // مربوط به دکمه بازگشت در اکشن بار
        if (getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    // متود اضافه کردن دکمه بازگشت در اکشن بار
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }

        TextView rules = findViewById(R.id.rules);
        return super.onOptionsItemSelected(item);
    }
}
