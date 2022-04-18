package com.sonnecto.utilities;

public class BrowserUtilties {
    public static void sleep(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
