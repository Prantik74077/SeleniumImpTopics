package com.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
    @Test
    public void clickandtype() throws Throwable
    {
       WebDriverManager.chromedriver().setup();
 	   WebDriver driver=new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.get("https://www.amazon.in/");
 	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 	   
 	   JavascriptExecutor js=(JavascriptExecutor)driver;
 	   
 	   js.executeScript("document.getElementById('twotabsearchtextbox').value='Iphone'");
 	   js.executeScript("document.getElementById('nav-search-submit-button').click()");
 	   js.executeScript("document.getElementById('nav-cart-count').click()");
 	   
 	   String expcarttext="Your Amazon Basket is empty";
 	   String actcarttext = driver.findElement(By.xpath("//div[@class='a-row sc-your-amazon-cart-is-empty']")).getText();
 	   if(expcarttext.equals(actcarttext))
 	   {
 		   System.out.println("true");
 	   }
 	   else
 	   {
 		   System.out.println("false");
 	   }
 	   
 	   driver.close();
    }
}
