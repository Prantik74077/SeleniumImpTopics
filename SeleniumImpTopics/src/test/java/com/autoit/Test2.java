package com.autoit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	@Test
    public void fileupload() throws Throwable
    {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demoapp.skillrary.com/");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	   driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("document.getElementById('email').value='user'");
	   js.executeScript("document.getElementById('password').value='user'");
	   js.executeScript("document.getElementById('last').click()");
	   
	   WebElement userimg = driver.findElement(By.xpath("//img[@class='user-image']"));
	   js.executeScript("arguments[0].click()",userimg);
	   
	   WebElement profile = driver.findElement(By.xpath("//a[text()='Profile']"));
	   js.executeScript("arguments[0].click()",profile);
	   
	   WebElement editbtn = driver.findElement(By.xpath("//i[@class='fa fa-edit']"));
	   js.executeScript("arguments[0].click()",editbtn);
	   
	   //WebElement chosefile = driver.findElement(By.xpath("//label[@for='photo']"));
	   //js.executeScript("arguments[0].click()",chosefile);
	   
	   driver.findElement(By.xpath("//label[@for='photo']")).click();
	   Runtime.getRuntime().exec("C:\\Users\\DELL User\\Desktop\\Autoit2.exe");
    }
}
