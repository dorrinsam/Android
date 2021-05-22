package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    Button btn_ok1;

    @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        // مربوط به دکمه بازگشت در اکشن بار
        if (getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //مربوط به دکمه تایید
        btn_ok1 = findViewById(R.id.btn_ok1);
        Button btn_ok1 = (Button) findViewById(R.id.btn_ok1);
        btn_ok1.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View v) {
                startActivity(new Intent(FourthActivity.this, My_account.class));
            }
        });
    }

    // متود اضافه کردن دکمه بازگشت در اکشن بار
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
