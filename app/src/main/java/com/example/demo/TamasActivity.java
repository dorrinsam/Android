package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TamasActivity extends AppCompatActivity {
      TextView telegram;
      TextView instagram;
      TextView poshtibani;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamas);

             //مربوط به تکست ویو آدرس تلگرام
             TextView telegram = findViewById(R.id.telegram);

             //مربوط به کانال اینستاگرام
             TextView instagram = findViewById(R.id.instagram);

             //مربوط به تماس با پشتیبانی
             TextView poshtibani = findViewById(R.id.poshtibani);


    }
}
