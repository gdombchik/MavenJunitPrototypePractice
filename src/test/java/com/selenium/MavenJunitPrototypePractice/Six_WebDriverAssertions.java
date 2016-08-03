package com.selenium.mavenJunitPrototypePractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six_WebDriverAssertions extends AbstractWebDriver {

	@Test
	public void webDriverAssertions(){
		click(By.id("contact_link"));
		Assert.assertTrue(driver.getTitle().equals("Contact"));
		
		type(By.name("name_field"),"name field");
		type(By.name("address_field"),"test address");
		type(By.name("postcode_field"),"test field");
		type(By.name("email_field"),"test email");
		
		//The getText on the name_field is not working for me 
		//System.out.println(driver.findElement(By.name("name_field")).getText());
		
		//This worked for me to acquire text from an input box
		Assert.assertFalse(driver.findElement(By.name("name_field")).getAttribute("value").isEmpty());
		
		click(By.id("submit_message"));
		//System.out.println(driver.getTitle());
		Assert.assertTrue("Page title was not expected",driver.getTitle().equals("Contact Confirmation"));
	}
	
	public void type(By by, String value){
		driver.findElement(by).sendKeys(value);
	}
	
	public void click(By by){
		driver.findElement(by).click();
	}
	
}
