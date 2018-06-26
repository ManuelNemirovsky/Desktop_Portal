package com.example.user.blothoothsender;

import android.app.Activity;
import android.gesture.Gesture;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Manuel on 6/21/2018.
 */
public class Gestures extends Activity implements GestureDetector.OnGestureListener , GestureDetector.OnDoubleTapListener {
    private GestureDetectorCompat gDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Gestures", "OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gestureText = (TextView)findViewById(R.id.gestureText);
        this.gDetector = new GestureDetectorCompat(this , this);
        gDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event)
    {
        //gestureText.setText("onDown");
        Toast.makeText(getApplicationContext(), "onDown",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1 , MotionEvent event2 , float velocityX , float velocityY)
    {
        //gestureText.setText("onFling");
        Toast.makeText(getApplicationContext(), "onFling",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event)
    {
        //gestureText.setText("onLongPress");
        Toast.makeText(getApplicationContext(), "onLongPress",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onScroll(MotionEvent e1 , MotionEvent e2 , float distanceX , float distanceY)
    {
        //gestureText.setText("onScroll");
        Toast.makeText(getApplicationContext(), "onScroll",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        //gestureText.setText("onSingleTapConfirmed");
        Toast.makeText(getApplicationContext(), "onSingleTapConfirmed",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        //gestureText.setText("onDoubleTap");
        Toast.makeText(getApplicationContext(), "onDoubleTap",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        //gestureText.setText("onDoubleTapEvent");
        Toast.makeText(getApplicationContext(), "onDoubleTapEvent",
                Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        //gestureText.setText("onShowPress");
        Toast.makeText(getApplicationContext(), "onShowPress",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        //gestureText.setText("onSingleTapUp");
        Toast.makeText(getApplicationContext(), "onSingleTapUp",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}
