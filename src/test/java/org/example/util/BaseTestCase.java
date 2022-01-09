package org.example.util;


import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.Data;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class BaseTestCase {

    public static final Logger logger = LogManager.getLogger(BaseTestCase.class);

    @BeforeMethod
    public void beforeMethod(){
        logger.info("started test case");
    }

    @AfterMethod
    public void afterMethod(){
        logger.info("execution test case stopped");
    }

    public static HashMap<String,String> headers(){
        HashMap<String,String> headers = new HashMap<>();
        headers.put("Authorization","token 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");

        return headers;
    }
}
