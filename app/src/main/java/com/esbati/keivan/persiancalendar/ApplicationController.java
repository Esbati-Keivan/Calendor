package com.esbati.keivan.persiancalendar;

import android.app.Application;
import android.content.Context;

import com.crashlytics.android.Crashlytics;
import com.onesignal.OneSignal;

import io.fabric.sdk.android.Fabric;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Esbati on 12/22/2015.
 */
public class ApplicationController extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        Fabric.with(this, new Crashlytics());
        OneSignal.startInit(this).init();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/IRANSans(FaNum).ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

    }

    public static Context getContext(){
        return mContext;
    }
}