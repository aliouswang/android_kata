package com.example.aliouswang.android_kata.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class FirstView extends View {

    public FirstView( Context context) {
        super(context);
    }

    public FirstView( Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public FirstView( Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        TouchKataActivity.log(ev, "First view dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        TouchKataActivity.log(event, "First view onTouchEvent");
        return super.onTouchEvent(event);
    }

}
