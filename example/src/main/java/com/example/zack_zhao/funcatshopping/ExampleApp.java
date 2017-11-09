package com.example.zack_zhao.funcatshopping;

import android.app.Application;

import com.example.latte.app.Latte;
import com.example.letter.ec.icon.FontEcModule;
import com.joanzapata.android.iconify.fonts.FontAwesomeModule;

/**
 * Created by zack-zhao on 2017/11/8.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1")
                .configure();
    }
}
