package com.frame;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
    @Test
    public void youtubelaunch() throws Throwable
    {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	
    	driver.findElement(By.xpath("//div[@class='gb_Af']")).click();
    	driver.switchTo().frame(0);
    	
    	driver.findElement(By.xpath("//span[text()='YouTube']")).click();
    	String title=driver.getTitle();
    	System.out.println("title="+title);
    	
    	if(title.equals("YouTube"))
    	{
    		System.out.println("pass:home page is displayed");
    	}
    	else
    	{
    		System.out.println("fail:home page is not displayed");
    	}
    	driver.findElement(By.xpath("//yt-formatted-string[@title='Music']")).click();
    }
}
