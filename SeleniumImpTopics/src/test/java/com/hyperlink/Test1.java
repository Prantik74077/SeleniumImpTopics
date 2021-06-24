package com.hyperlink;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	   @Test
       public void hyperlink() throws Throwable
       {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://wbpolice.gov.in/");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	   driver.findElement(By.xpath("//a[@id='HyperLink1']")).click();
	   
	   String parent = driver.getWindowHandle();
       Set<String> child = driver.getWindowHandles();
       
	   ArrayList<String> list=new ArrayList<String>(child);
	   
       for(int i=0;i<list.size();i++)
       {
   	     if(i==1)
   	     {
   		  driver.switchTo().window(list.get(i));
   		  break;
   	     }
       }
        Thread.sleep(3000);
        Robot r=new Robot();
		for(int i=0;i<2;i++)
		{
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.switchTo().window(parent);
        }
}

