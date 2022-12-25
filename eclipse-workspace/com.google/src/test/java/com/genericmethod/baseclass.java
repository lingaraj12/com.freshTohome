package com.genericmethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.objectrepo.homepage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	
public static WebDriver driver;
public fileLib fl=new fileLib();
public String paths="environment.properties";
public homepage hp;
public commonUtil cu=new commonUtil();

	@BeforeTest
	public void configBT() throws IOException {
		if(fl.getDataFromProperties(paths, "browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		hp=PageFactory.initElements(driver, homepage.class);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().window().maximize();
driver.get(fl.getDataFromProperties(paths,"url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


