package DharmajaBasic1;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

public class SetExample {
	
     

  @Test
  public void ExamplesOnSet() throws Exception{
	  
	  Set<String> hash_Set =  new HashSet<String>();
	  hash_Set.add("Geeks"); 
      hash_Set.add("For"); 
      hash_Set.add("Geeks"); 
      hash_Set.add("Example"); 
      hash_Set.add("Set");
      int  TotalStrings= hash_Set.size();
      
      System.out.println("Total Strings "+TotalStrings);

      List<String> aList = new ArrayList<String>( TotalStrings); 
      for (String x : aList) 
      {
          aList.add(x); 
         // System.out.println("Created ArrayList is"+aList.get(0)); 
          
      }
      
      System.out.println(" ArrayList is"+aList.get(2)); 
     /* 
      System.out.println("first String "+aList.get(1));
      System.out.println("first String "+aList.get(2));
      System.out.println("first String "+aList.get(3));
    //  System.out.println("first String "+aList.get(4));
	}             
  */
  }
  
}