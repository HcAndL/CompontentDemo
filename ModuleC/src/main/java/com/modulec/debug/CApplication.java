package com.modulec.debug;


import android.util.Log;

import com.basemodule.BaseApplication;

/**
 * author chmyy
 * created on 2017/12/18
 * email fat_chao@163.com.
 */

public class CApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.w("TAG", "---BApplication");
    }
}
