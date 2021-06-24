package com.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5
{
public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,7000)");   //top to bottom . We are giving pixel size for y axis as it is vertical.so x=0 
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-7000)");  //bottom to top
	Thread.sleep(3000);
	driver.close();
}
}