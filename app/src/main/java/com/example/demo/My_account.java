package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class My_account extends AppCompatActivity {

    TextView profile;
    Button basket;
    Button favorites;
    Button bought;
    Button pishnehad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
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
        return super.onOptionsItemSelected(item);
    }
    // Toolbar Items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // آیتم خبرنامه
        menu.add("خبرنامه").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent(My_account.this , Newsletter.class));
                return false;
            }
        });

        //آیتم خروج از حساب کاربری
        menu.add("خروج از حساب کاربری").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent (My_account.this , SecondActivity.class));
                return false;
            }
        });

        //مربوط به تکست ویو پروفایل من
       TextView profile = findViewById(R.id.profile);

       //مربوط به دکمه سبد خرید من
       Button basket = findViewById(R.id.basket);
       basket.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(My_account.this, BasketActivity.class));
           }
       });

       //مربوط به دکمه محبوب ترین ها
       Button favorites = (Button) findViewById(R.id.favorites);
       favorites.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(My_account.this, FavoritesActivity.class));
           }
       });


      //مربوط به دکمه کالا های خریداری شده
       Button bought = (Button) findViewById(R.id.bought);
       bought.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(My_account.this, BoughtActivity.class));
           }
       });


       //مربوط به دکمه کالاهای پیشنهادی
       Button pishenad = (Button) findViewById(R.id.pishnehad);
       pishenad.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(My_account.this, SuggestionActivity.class));
           }
       });



        return super.onCreateOptionsMenu(menu);
    }


}
