package com.example.autogenerateclass.utils;


import lombok.extern.log4j.Log4j2;

import java.util.Properties;

@Log4j2
public class CommonUtils {

    public static boolean setPath(String pathString){
        try {
            Properties properties = new Properties();
            properties.put("path",pathString);
            System.setProperties(properties);
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return true;
        }
    }

    public static String getPath(){
        return System.getProperty("path");
    }
}
