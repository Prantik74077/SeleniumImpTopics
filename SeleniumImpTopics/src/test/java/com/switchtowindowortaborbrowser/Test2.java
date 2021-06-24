package com.switchtowindowortaborbrowser;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
    @Test
    public void sample2() throws Throwable
    {
       WebDriverManager.chromedriver().setup();
 	   WebDriver driver=new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.get("https://www.flipkart.com/");
 	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 	   
 	   driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()='Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power...']")).click();

        String parent = driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        
		ArrayList<String> list=new ArrayList<String>(child);
		System.out.println(list.size());
		
        for(int i=0;i<list.size();i++)
        {
    	  if(i==1)
    	  {
    		  driver.switchTo().window(list.get(i));
    		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    	  }
        }
      driver.switchTo().window(parent);
      driver.quit();
	  }	   
}
