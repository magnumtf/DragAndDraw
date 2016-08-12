package com.buber.draganddraw;

import android.graphics.PointF;

/**
 * Created by t1004800 on 8/4/2016.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }
}
