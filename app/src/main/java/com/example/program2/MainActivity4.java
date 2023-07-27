package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.swipe).setOnTouchListener(new Swipe(this){
            @Override
            public void left(){
                Intent first = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(first);
                overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
            }
            @Override
            public void right(){
                Intent sec = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(sec);
                overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
            }
        });
    }

    public void main(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void alta(View view) {
        Intent alta = new Intent(this, MainActivity7.class);
        startActivity(alta);
    }

    public void first(View view) {
        Intent first = new Intent(this, MainActivity2.class);
        startActivity(first);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void sec(View view) {
        Intent sec = new Intent(this, MainActivity3.class);
        startActivity(sec);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }
}