package com.example.nedkosavov.nativelib;

/**
 * Created by nedko.savov on 9/25/2015.
 */
public class TestLib {

    public String test()
    {
       return stringFromJNI();
    }

    static{
        System.loadLibrary("nativelib");
    }
    public native String  stringFromJNI();
}
