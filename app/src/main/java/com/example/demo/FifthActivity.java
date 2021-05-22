package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {
          TextView verification;
          TextView sentcode;
          TextView sentcode2;
          Button sms;
          Button call;
          EditText vercode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        //تا دقایقی دیگر کد تایید برای شما ارسال میشود
        sentcode = (TextView) findViewById(R.id.sentcode);

        //تا دقایقی دیگر کد تایید از طرف اپراتور به شما اعلام میگردد
        sentcode2 = (TextView) findViewById(R.id.sentcode2);

        //مربوط به دکمه پیامک
        final Button sms = (Button) findViewById(R.id.sms);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vercode.setVisibility(View.VISIBLE);
                sentcode.setVisibility(View.VISIBLE);
                sentcode.setText("تا دقایقی دیگر کد تایید برای شما ارسال میشود.");
            }
        });


        //مربوط به دکمه تماس تلفنی
        final Button call = (Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vercode.setVisibility(View.VISIBLE);
                sentcode2.setVisibility(View.VISIBLE);
                sentcode2.setText("تا دقایقی دیگر کد تایید از طرف اپراتور به شما اعلام میگردد.");
            }
        });

        //مربوط به کد تایید
        vercode = (EditText) findViewById(R.id.vercode);


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

        //مربوط به تکست ویو مایلید کد تایید چگونه برای شما ارسال شود
        TextView verification = findViewById(R.id.verification);
        return super.onOptionsItemSelected(item);
    }
}
