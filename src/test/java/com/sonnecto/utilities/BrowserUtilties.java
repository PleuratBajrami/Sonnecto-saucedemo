package com.sonnecto.utilities;

public class BrowserUtilties {
    public void sleep(int seconds){
        try{
            Thread.sleep(seconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
