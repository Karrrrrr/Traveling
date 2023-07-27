package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        findViewById(R.id.swipe).setOnTouchListener(new Swipe(this){
            @Override
            public void left(){
                Intent third = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(third);
                overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
            }
            @Override
            public void right(){
                Intent first = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(first);
                overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
            }
        });
    }

    public void main(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void cermatt(View view) {
        Intent cermatt = new Intent(this, MainActivity6.class);
        startActivity(cermatt);
    }

    public void first(View view) {
        Intent first = new Intent(this, MainActivity2.class);
        startActivity(first);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }

    public void third(View view) {
        Intent third = new Intent(this, MainActivity4.class);
        startActivity(third);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }
}