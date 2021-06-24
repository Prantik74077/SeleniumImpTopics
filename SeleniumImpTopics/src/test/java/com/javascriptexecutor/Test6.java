package com.javascriptexecutor;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6
{
public static void main(String[] args) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement ele = driver.findElement(By.xpath("(//a[text()='See more'])[9]"));
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	System.out.println(x);
	System.out.println(y);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("window.scrollBy,("+x+","+y+")");
	Thread.sleep(5000);
	ele.click();
	Thread.sleep(5000);
	driver.close();
}
}
