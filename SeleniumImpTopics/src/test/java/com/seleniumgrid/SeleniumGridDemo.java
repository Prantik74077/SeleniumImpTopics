package com.seleniumgrid;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo 
{
   @Test
   public void test1() throws Throwable
   {
	   try 
	   {
		   URL remoteaddress=new URL("http://192.168.0.101:4444/wd/hub");
		   DesiredCapabilities cap= DesiredCapabilities.chrome();
		   /*DesiredCapabilities cap=new DesiredCapabilities();
		   cap.setBrowserName("chrome");
		   cap.setPlatform(Platform.WIN10);*/
				
		   RemoteWebDriver driver =new RemoteWebDriver(remoteaddress,cap);
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   System.out.println("Title of the page is="+driver.getTitle());
		   driver.quit();
		   
	    } 
	   
	   catch (Exception e) 
	   {
		  e.printStackTrace();
	   }
   }
}
