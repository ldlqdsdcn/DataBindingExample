/*
 * Copyright (C) ScanTrust SA - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * ScanTrust Authors, 2015
 */
package indi.solomon.android.databinding.example.util;

import android.graphics.Typeface;
import android.util.Log;

import indi.solomon.android.databinding.example.MainApplication;


/**
 * Created by Solomon.liu on 2015-06-03 15:49.
 * set roboto font setting.
 */
public class FontContent {
    private static FontContent fontContent;
    private Typeface robotoLight;
    private Typeface robotoRegular;
    private Typeface robotoThin;
    private Typeface robotoMedium;

    private FontContent() {
        robotoLight = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "font/Roboto-Light.ttf");
        robotoRegular = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "font/Roboto-Regular.ttf");
        robotoThin = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "font/Roboto-Thin.ttf");
        robotoMedium = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "font/Roboto-Medium.ttf");

    }

    public static String getButtonName() {
        Log.d("DataBindTest", "-------------------------------return ButtonName aaaaaaaaaaaaaa");
        return "aaaaaaaaaaaaaa";
    }

    public static synchronized FontContent getInstance() {
        if (fontContent == null) {
            fontContent = new FontContent();
        }
        return fontContent;
    }

    public Typeface getRobotoLight() {
        return robotoLight;
    }

    public Typeface getRobotoRegular() {
        return robotoRegular;
    }

    public Typeface getRobotoThin() {
        return robotoThin;
    }

    public Typeface getRobotoMedium() {
        return robotoMedium;
    }
}
