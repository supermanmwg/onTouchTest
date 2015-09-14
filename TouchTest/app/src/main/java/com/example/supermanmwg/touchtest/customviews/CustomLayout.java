package com.example.supermanmwg.touchtest.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by supermanmwg on 15-9-14.
 */
public class CustomLayout extends FrameLayout {
    public CustomLayout(Context context) {
        super(context);
    }

    public CustomLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        Log.d("haha", "Layout on InterceptTouchEvent");
        Log.d("haha", "Layout on InterceptTouchEvent return " + super.onTouchEvent(ev));
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("haha", "Layout on TouchEvent");
        Log.d("haha", "Layout on TouchEvent return " + super.onTouchEvent(event));

        return super.onTouchEvent(event);
    }
}
