package com.slider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
   @Test
   public void slide() throws Throwable
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://jqueryui.com/slider/");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	   driver.switchTo().frame(0);
	   WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
	   Actions a =new Actions(driver);
	   a.dragAndDropBy(slider,200,0).perform();
	   Thread.sleep(2000);
	   a.dragAndDropBy(slider,-200,0).perform();
   }
}
