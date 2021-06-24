package com.seleniumgrid;

import java.net.URL; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteExecutionReport 
{
    @Test
    public void createcontact() throws Throwable
    {
    	URL remoteaddress=new URL("http://localhost:4444/wd/hub");
    	DesiredCapabilities cap= DesiredCapabilities.chrome();
    			
    	RemoteWebDriver driver =new RemoteWebDriver(remoteaddress,cap);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get("http://localhost:8888");
    }
} 
