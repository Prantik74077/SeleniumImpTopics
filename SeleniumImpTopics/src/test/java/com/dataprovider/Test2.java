package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.genericlib.ExcelUtility;

public class Test2 
{
	ExcelUtility excel =new ExcelUtility();
	@Test(dataProvider="getData")
    public void SampleDataTest(String src,String dst) throws Throwable
    {
	     System.out.println("source==> "+src +"  destination==>"+dst);     
    }
	
	@DataProvider
    public Object [][] getData() throws Throwable
    {
	          int rowIndex= excel.getRowCount("Sheet1");
	          rowIndex++;
	          Object [] [] objArr=new Object[rowIndex][2];
	          for(int i=0;i<rowIndex;i++)
	          {
		           objArr[i][0]=excel.getExcelData("Sheet1",i,0);
		           objArr[i][1]=excel.getExcelData("Sheet1",i,1);
		           excel.setExcelData("Sheet1",i,2,"src");
		           excel.setExcelData("Sheet1",i,3,"dest");
	          }
	               return objArr;	
    }
}
