package com.example.aliouswang.android_kata.touch;

import android.content.Context;
import android.text.method.Touch;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class FirstViewGroup extends FrameLayout {

    public FirstViewGroup( Context context) {
        super(context);
    }

    public FirstViewGroup( Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public FirstViewGroup( Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        TouchKataActivity.log(ev, "First viewGroup dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        TouchKataActivity.log(ev, "First viewGroup onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        TouchKataActivity.log(event, "First viewGroup onTouchEvent");
        return super.onTouchEvent(event);
    }
}
