package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity{
    Button btn_ok2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);


        // مربوط به دکمه بازگشت در اکشن بار
        if (getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
            //مربوط به دکمه مرحله بعد
            btn_ok2 = findViewById(R.id.btn_ok2);
            Button btn_ok2 = (Button) findViewById(R.id.btn_ok2);
            btn_ok2.setOnClickListener(new View.OnClickListener(){
                @Override
                    public void onClick(View v){
                       startActivity(new Intent(ThirdActivity.this, SixthActivity.class));
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
