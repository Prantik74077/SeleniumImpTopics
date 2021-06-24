package com.calenderwindow;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	  @Test
	  public void selectcurrentdate() throws Throwable
	  {
 	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.makemytrip.com/");
	     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	     
 	     Actions act=new Actions(driver);
 	     act.moveByOffset(10,10).click().perform();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	     
	     Date dateobj=new Date();
	     String strdate = dateobj.toString();
	     String [] arr = strdate.split(" ");
	     String year = arr[5];
	     String month = arr[1];
	     String date = arr[2];
	     System.out.println(strdate);
	     
	     String x="//div[contains(@aria-label,'"+month+" "+date+" "+year+"')]";
	     //String x="//div[contains(@aria-label,'"+month+" "+date+" "+year+"')]/div/p[text()='"+date+"']";
	     driver.findElement(By.xpath(x)).click();   
	  }
}
