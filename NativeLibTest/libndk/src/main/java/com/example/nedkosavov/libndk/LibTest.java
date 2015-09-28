package com.example.nedkosavov.libndk;

/**
 * Created by nedko.savov on 9/25/2015.
 */
public class LibTest {

    public String test()
    {
        return stringFromJNI();
    }

    public native String stringFromJNI();

    static {
        System.loadLibrary("nativendk");
    }
}
