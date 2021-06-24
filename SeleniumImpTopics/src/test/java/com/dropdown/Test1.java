package com.dropdown;

import java.util.ArrayList;      
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Test1 
{
        @Test
        public void sortdropdownelement()
        {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    WebElement ele = driver.findElement(By.id("month"));
	    
	    Select s=new Select(ele);
	    List<WebElement> options = s.getOptions();
	    System.out.println(options.size());
	    
	    ArrayList a=new ArrayList();
	    
	    for(WebElement b:options) 
	    {
	    	String t = b.getText();
	    	System.out.println(t);
	    	a.add(t);
	    }
	    System.out.println("***********************");
	    
	    System.out.println("after sorting");   //ascending order
	    
	    Collections.sort(a);
	    for(Object c:a) 
	    {
	    	System.out.println(c);
	    }
	}
}