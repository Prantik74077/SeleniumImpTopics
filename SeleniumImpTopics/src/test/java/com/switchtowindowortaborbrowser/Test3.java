package com.switchtowindowortaborbrowser;

import java.awt.Robot; 
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 
{
	@Test
	   public void sample3() throws Throwable
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
		   
		   Thread.sleep(3000);
		   
		   
		   Set<String> set = driver.getWindowHandles();
		   driver.get("https://www.instagram.com/");
				  
		   for(String act : set) 
		   {
			   driver.switchTo().window(act);
			   String actPageTile = driver.getTitle();
			   if(actPageTile.contains("Instagram")) 
			   {
				   break;
			   }
		    }
	   }
}
