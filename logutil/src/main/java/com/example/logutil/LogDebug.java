package com.example.logutil;

import android.util.Log;

/**
 * Created by Mayank Singhal on 9/9/2017.
 */

public class LogDebug {
    private static final String Tag="super_awesome_app";
    public static void d(String message){
        Log.d(Tag,message);
    }
}
