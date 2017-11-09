package com.example.letter.ec.icon;

import com.joanzapata.android.iconify.Icon;
import com.joanzapata.android.iconify.IconFontDescriptor;

/**
 * Created by zack-zhao on 2017/11/8.
 */

public class FontEcModule implements IconFontDescriptor{

    @Override
    public String ttfFileName() {
        return "iconfont.ttf";
    }

    @Override
    public Icon[] characters() {
        return EcIcons.values();
    }
}
