package com.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 
{
	@Test
    public void typeandreturn() throws Throwable
    {
	   WebDriverManager.chromedriver().setup();
 	   WebDriver driver=new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.get("https://www.amazon.in/");
 	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 	   
 	   JavascriptExecutor js=(JavascriptExecutor)driver;
 	   
 	   js.executeScript("document.getElementById('twotabsearchtextbox').value='Iphone'");
 	   
 	   String text = (String)js.executeScript("return document.getElementById('twotabsearchtextbox').value");
 	   System.out.println(text);
 	   
 	   driver.close();
    }
}
