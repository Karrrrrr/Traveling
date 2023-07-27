package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        findViewById(R.id.swipe).setOnTouchListener(new Swipe(this){
            @Override
            public void left(){
                Intent sec = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(sec);
                overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
            }
            @Override
            public void right(){
                Intent third = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(third);
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

    public void sec(View view) {
        Intent sec = new Intent(this, MainActivity6.class);
        startActivity(sec);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void source(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ischgl.com/en"));
        startActivity(browser);
    }
}