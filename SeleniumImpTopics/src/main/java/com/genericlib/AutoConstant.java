package com.genericlib;

public interface AutoConstant  
{
      String currentdirpath=System.getProperty("user.dir");
      String propertyfilepath=currentdirpath+"/src/test/resources/data1.properties";
      String excelpath=currentdirpath+"/src/test/resources/Exceldata1.xlsx";
      String screenshotpath="./Screenshot/";
      
      public int implicitlyWait=20;
      public int explicitlyWait=30;
}
