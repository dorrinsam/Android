package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView tv1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        //مربوط به تکست ویو خوش آمدید
        TextView tv = findViewById(R.id.tv);

        //مربوط به تکست ویو شروع کار با اپ
        TextView tv1 = findViewById(R.id.tv1);

        //مربوط به دکمه شروع
        button = findViewById(R.id.button);

        Button botton = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

    }



    // ساخت منو و دادن اکشن به آیتم ها
    @Override
    public boolean onCreateOptionsMenu(final Menu menu){
        // آیتم "حساب کاربری من"
        menu.add("حساب کاربری من").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
            startActivity(new Intent(MainActivity.this , My_account.class));
                return false;
            }
        });
        // آیتم "دربار ما"
        menu.add("درباره ما").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent(MainActivity.this, About_us.class));
                return false;
            }
        });

     // آیتم "تنظیمات"
        menu.add("تنظیمات").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent(MainActivity.this ,SettingActivity.class));
                return false;
            }
        });
        //صفحه FAQ
        menu.add("FAQ").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent(MainActivity.this, FAQActivity.class));
                return false;
            }
        });

        // آیتم "خروج" و با کلیک بر روی این آیتم برنامه به طور کامل بسته میشه
        menu.add("خروج").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return false;
            }
                });

        return super.onCreateOptionsMenu(menu);
    }
}



