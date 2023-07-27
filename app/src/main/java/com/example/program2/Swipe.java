package com.example.program2;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class Swipe implements View.OnTouchListener {
    private final GestureDetector gd;
    public Swipe(Context context) {
        gd = new GestureDetector(context, new GestureListener());
    }
    public void left() {
    }
    public void right(){
    }
    public boolean onTouch(View v, MotionEvent me) {
        return gd.onTouchEvent(me);
    }

    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final int distance = 100;
        private static final int velocity = 100;
        @Override
        public boolean onDown(MotionEvent me) {
            return true;
        }
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            float distanceX = e2.getX() - e1.getX();
            float distanceY = e2.getY() - e1.getY();
            if (Math.abs(distanceX) > Math.abs(distanceY) && Math.abs(distanceX) > distance && Math.abs(velocityX) > velocity) {
                if (distanceX > 0) {
                    right();
                }
                else {
                    left();
                }
                return true;
            }
            return false;
        }
    }
}
