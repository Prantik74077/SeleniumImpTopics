package com.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Test1 
{
	Logger logger=LogManager.getLogger(Test1.class);
    @Test
    public void log4jdemo()
    {
    	System.out.println("\n Hello World \n");
    	
    	logger.trace("This is trace message");
    	logger.info("This is information message");
    	logger.error("This is error message");
    	logger.warn("This is warning message");
    	logger.fatal("This is fatal message");
    	
    	System.out.println("\n Completed \n");
    }
}

//appender.file.append=true  ==> Log message will be appended or overwritten(If needed then in line no 17)
//logger.file.level=off and rootLogger.level=off  ==> Log messages will not be shown in console and Mylogs.log
//  (If needed then in line no 21,26 change it)