package com.example.aliouswang.android_kata.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class SecondViewGroup extends FrameLayout {

    public SecondViewGroup( Context context) {
        super(context);
    }

    public SecondViewGroup( Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public SecondViewGroup( Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        TouchKataActivity.log(ev, "Second viewGroup dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        TouchKataActivity.log(ev, "Second viewGroup onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        TouchKataActivity.log(event, "Second viewGroup onTouchEvent");
        return super.onTouchEvent(event);
    }

}
