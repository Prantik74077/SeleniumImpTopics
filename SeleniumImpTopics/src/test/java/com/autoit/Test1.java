package com.autoit;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	   @Test
       public void fileupload() throws Throwable
       {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.naukri.com/");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	   driver.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
	   Runtime.getRuntime().exec("C:\\Users\\DELL User\\Desktop\\Autoit1.exe");
       }
}
