package org.example.util;

import java.util.Properties;

public class Constants {
    public static String BASE_URL = "https://api.github.com/";
    public static String LIST_BRANCHES_ENDPOINT = "repos/%s/%s/branches";

    public static Properties properties = new Properties();

    static {
        try{
            properties.load(Constants.class.getResourceAsStream("/" + "user.properties"));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
