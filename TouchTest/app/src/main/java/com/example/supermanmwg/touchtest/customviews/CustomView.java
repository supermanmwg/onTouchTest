package com.example.supermanmwg.touchtest.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by supermanmwg on 15-9-14.
 */
public class CustomView extends Button {

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("haha", " View on TouchEvent");
        Log.d("haha", "View on TouchEvent return " + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
