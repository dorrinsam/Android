package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv2;
    Button button1;
    Button button2;
      @Override
         protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_second);


          // مربوط به دکمه بازگشت در اکشن بار
          if (getSupportActionBar() !=null){
              getSupportActionBar().setDisplayHomeAsUpEnabled(true);
          }
               //مربوط به تکست ویو کاربر سایت
              TextView tv2 = findViewById(R.id.tv2);

              //مربوط به دکمه عضو هستم
              button1 = findViewById(R.id.button1);

              //مربوط به دکمه میخواهم عضو شوم
              button2 = findViewById(R.id.button2);

              Button botton1 = (Button) findViewById(R.id.button1);
              Button botton2 = (Button) findViewById(R.id.button2);
              button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(SecondActivity.this, FourthActivity.class));
            }
        });
                 button2.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View v) {
                 startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
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
