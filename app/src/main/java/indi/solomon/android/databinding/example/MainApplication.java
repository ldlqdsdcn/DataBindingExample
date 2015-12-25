/*
 * This file is copyrighted Solomon.liu all
 * Solomon , 2015
 */
package indi.solomon.android.databinding.example;

import android.app.Application;
import android.content.Context;

/**
 * Created by Solomon.liu on 2015/12/25.
 */
public class MainApplication extends Application {
    public static final String TAG="DataBindingExample";
    private static MainApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getAppContext() {
        return context;
    }

}
