package com.hectorware.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private ConfigReader(){}

    protected static Properties properties = new Properties();

    static{
        try{

            String path= "configuration.properties";

            FileInputStream inputStream = new FileInputStream(path);

            properties.load(inputStream);

            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String get(String keyName){
        return properties.getProperty(keyName);
    }

}
