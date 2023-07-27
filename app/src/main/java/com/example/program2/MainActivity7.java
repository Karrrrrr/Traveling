package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        findViewById(R.id.swipe).setOnTouchListener(new Swipe(this){
            @Override
            public void left(){
                Intent first = new Intent(MainActivity7.this, MainActivity5.class);
                startActivity(first);
                overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
            }
            @Override
            public void right(){
                Intent sec = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(sec);
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

    public void first(View view) {
        Intent first = new Intent(this, MainActivity5.class);
        startActivity(first);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void source(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.altabadia.org/en/alta-badia-italian-alps-dolomites.html"));
        startActivity(browser);
    }
}