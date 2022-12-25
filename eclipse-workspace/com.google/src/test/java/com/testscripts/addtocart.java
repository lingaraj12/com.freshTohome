package com.testscripts;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericmethod.baseclass;

public class addtocart extends baseclass {
	@Test
	public void AddToCarttest() {
		hp.getHome().click();
		Reporter.log("landed on pdt details page", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.getBreast().click();
		//cu.waitForAlert(driver);
		//cu.acceptalert(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.getAddtocart().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.getViewcart().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hp.getCart().click();
		//try {
			//hp.getCart().click();
		//}catch
		//(NoSuchElementException e) {
		//	Assert.assertTrue(false, "test case failed");
		//}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
