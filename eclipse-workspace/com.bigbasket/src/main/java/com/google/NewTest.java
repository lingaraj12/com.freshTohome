package com.google;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import google.utilities.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
 public String st;
 public WebDriver driver;
 @Test
  public void launchapp() throws InterruptedException, IOException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(constants.wait_in_secs);
		GenericMethods gm=new GenericMethods();
		String st=gm.PropertyReader("URL");
		driver.get(st);
		String st1=gm.PropertyReader("Username");
	    String st2=gm.PropertyReader("Password");
	System.out.println(st1);
	System.out.println(st2);

 
 
 
 }
}
