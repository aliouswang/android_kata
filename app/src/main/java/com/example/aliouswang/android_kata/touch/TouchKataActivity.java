package com.example.aliouswang.android_kata.touch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import com.example.aliouswang.android_kata.R;

public class TouchKataActivity extends AppCompatActivity {

    public static final String TAG = "touch_kata";
    public static final int TARGET_ACTION = MotionEvent.ACTION_DOWN;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_touch_kata);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        log(ev, "activity dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        log(event, "activity onTouchEvent");
        return super.onTouchEvent(event);
    }

    public static void log(MotionEvent event, String message) {
        if (event.getAction() == TARGET_ACTION) {
            Log.d(TAG, message);
        }
    }
}
