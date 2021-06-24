package com.switchtowindowortaborbrowser;

import java.awt.Robot; 
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
   @Test
   public void sample1() throws Throwable
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_T);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_T);
	   
	   
	   String parent = driver.getWindowHandle();
       Set<String> child = driver.getWindowHandles();
       
       for(String s1:child)
       {	 
       Thread.sleep(3000);
       driver.switchTo().window(s1);
       driver.get("https://www.instagram.com/");
       }
         
       //driver.switchTo().window(parent);
       //driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
       
       //driver.close();
   }
}
