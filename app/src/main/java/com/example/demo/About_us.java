package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class About_us extends AppCompatActivity {

        Button info;
        Button connect_with_us;
        Button ReportProblem ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        // دکمه ارتباط با جیمیل
        info = findViewById(R.id.info);
        // دکمه ارتباط با شماره تلفن
        connect_with_us = findViewById(R.id.connect_with_us);
        // دکمه گزارش مشکل
        ReportProblem = findViewById(R.id.ReportProblem);

        //مربوط به دکمه info@example
        final Button info = (Button) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(About_us.this, infoActivity.class));
            }
        });

        //مربوط به دکمه تماس با ما
       Button connect_with_us = (Button) findViewById(R.id.connect_with_us);
       connect_with_us.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(About_us.this, TamasActivity.class));
           }
       });

       //مربوط به دکمه گزارش مشکل
       Button ReportProblem = (Button) findViewById(R.id.ReportProblem);
       ReportProblem.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(About_us.this, ProbActivity.class));
           }
       });






    }
}
