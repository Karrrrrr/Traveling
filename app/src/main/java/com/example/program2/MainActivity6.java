package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        findViewById(R.id.swipe).setOnTouchListener(new Swipe(this){
            @Override
            public void left(){
                Intent third = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(third);
                overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
            }
            @Override
            public void right(){
                Intent first = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(first);
                overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
            }
        });
    }

    public void main(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void gallery(View view) {
        Intent gallery = new Intent(this, MainActivity2.class);
        startActivity(gallery);
    }

    public void third(View view) {
        Intent third = new Intent(this, MainActivity7.class);
        startActivity(third);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void source(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zermatt.ch/ru"));
        startActivity(browser);
    }
}