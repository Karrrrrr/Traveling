package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.OnSwipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.swipe).setOnTouchListener(new Swipe(this){
            @Override
            public void left(){
                Intent sec = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(sec);
                overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
            }
            @Override
            public void right(){
                Intent third = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(third);
                overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
            }
        });
    }

    public void main(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void ishgl(View view) {
        Intent ishgl = new Intent(this, MainActivity5.class);
        startActivity(ishgl);
    }

    public void sec(View view) {
        Intent sec = new Intent(this, MainActivity3.class);
        startActivity(sec);
        overridePendingTransition(R.anim.to_right1, R.anim.to_right2);
    }

    public void third(View view) {
        Intent third = new Intent(this, MainActivity4.class);
        startActivity(third);
        overridePendingTransition(R.anim.to_left1, R.anim.to_left2);
    }
}