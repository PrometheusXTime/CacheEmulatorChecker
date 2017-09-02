package com.snail.device;

import android.app.Application;

/**
 * Author: snail
 * Data: 2017/8/3 下午3:26
 * Des:
 * version:
 */

public class CrashHandlerApplication extends Application {

    private static  Application sApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        sApplication =this;
        Thread.setDefaultUncaughtExceptionHandler(new CrashHandler());
    }

    public static Application getApplication(){
        return sApplication;
    }
}
