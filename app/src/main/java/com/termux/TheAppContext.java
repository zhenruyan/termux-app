package com.termux;

import android.app.Application;

/**
 * Created by free on 17-12-8.
 */

public class TheAppContext extends Application {
    private static TheAppContext mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static TheAppContext getInstance() {
        return mInstance;
    }
}
