package com.example.letter.ec.icon;

import com.joanzapata.android.iconify.Icon;

/**
 * Created by zack-zhao on 2017/11/8.
 */

public enum EcIcons implements Icon{
    icon_scan('\ue67c'),
    icon_ali_pay('\ue609');

    private  char character;
    EcIcons (char character){
        this.character = character;
    }
    @Override
    public String key() {
        return name().replace('_','_');
    }

    @Override
    public char character() {
        return character;
    }
}
