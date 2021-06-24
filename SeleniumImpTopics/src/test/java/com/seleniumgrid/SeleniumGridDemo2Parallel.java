package com.seleniumgrid;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo2Parallel 
{
	@Test
	   public void test2() throws Throwable
	   {
		   try 
		   {
			   System.out.println("Test2 started");
			   URL remoteaddress=new URL("http://192.168.0.101:4444/wd/hub");
			   DesiredCapabilities cap= DesiredCapabilities.chrome();
			   
			   RemoteWebDriver driver =new RemoteWebDriver(remoteaddress,cap);
			   driver.manage().window().maximize();
			   driver.get("https://www.amazon.in/");
			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   System.out.println("Title of the page is="+driver.getTitle());
			   driver.quit(); 
			   System.out.println("Test2 ended");
		    } 
		   
		   catch (Exception e) 
		   {
			  e.printStackTrace();
		   }
	   }
	
	
	@Test
	   public void test3() throws Throwable
	   {
		   try 
		   {
			   System.out.println("Test3 started");
			   URL remoteaddress=new URL("http://192.168.0.101:4444/wd/hub");
			   DesiredCapabilities cap= DesiredCapabilities.chrome();
			   
			   RemoteWebDriver driver =new RemoteWebDriver(remoteaddress,cap);
			   driver.manage().window().maximize();
			   driver.get("https://www.amazon.in/");
			   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			   System.out.println("Title of the page is="+driver.getTitle());
			   driver.quit(); 
			   System.out.println("Test3 ended");
		    } 
		   
		   catch (Exception e) 
		   {
			  e.printStackTrace();
		   }
	   }
} 
