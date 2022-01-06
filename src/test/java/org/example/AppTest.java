package org.example;


import org.example.util.Constants;
import org.testng.annotations.Test;

import java.util.Properties;

import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static Properties properties = new Properties();

    static {
        try {
            properties.load(AppTest.class.getResourceAsStream(  "/" + "user.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(properties.getProperty("USER_NAME"));
    }
}
