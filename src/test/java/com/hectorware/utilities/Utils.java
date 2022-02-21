package com.hectorware.utilities;

public class Utils {

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
