package com.selenium.mavenJunitPrototypePractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class Ten_WebDriverXPath extends AbstractPageStepDefinition{

	WebDriver driver;
	
	@Before
	public void setUp(){
		driver = getWebdriver();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void xpath(){
		driver.navigate().to("http://www.thetestroom.com/webapp");
		
		//driver.findElement(By.linkText("CONTACT")).click();
		//driver.findElement(By.xpath("//a[@id='contact_link']")).click();
		driver.findElement(By.xpath("//a[contains(@id,'contact_link')]")).click();
		
		// --> / Selects from the root node
		//WebElement element = driver.findElement(By.xpath("//link"));
		//System.out.println(element.getAttribute("rel"));
		
		WebElement element = driver.findElement(By.xpath("//input[@name='email_field']"));
		element.sendKeys("asdf@gmail.com");
		
		//System.out.println(element.getAttribute("value"));
		
		Assert.assertTrue("asdf@gmail.com".equals(element.getAttribute("value")));
		
		//System.out.println("hello");
	}
	
}
