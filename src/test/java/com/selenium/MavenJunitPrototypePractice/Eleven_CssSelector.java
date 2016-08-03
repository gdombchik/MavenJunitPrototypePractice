package com.selenium.mavenJunitPrototypePractice;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.utils.WebDriverUtils;

public class Eleven_CssSelector extends AbstractPageStepDefinition {

	WebDriver driver;
	
	@Before
	public void setUps(){
		driver = getWebdriver();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void cssSelector(){
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		
		//1.  id --> id uses the hash key (#)
		driver.findElement(By.cssSelector("#contact_link")).click();
		
		//2.  tags or nodes
		//System.out.println(driver.findElements(By.cssSelector("p")).get(0).getText());
		List<WebElement> tagWebElements = driver.findElements(By.cssSelector("p"));
		Assert.assertTrue(tagWebElements.get(0).getText().equals("Use the form below to contact us if you have any questions, "
				+ "queries or even any requests. "
				+ "We are always happy to hear from you all."));
		
		WebDriverUtils util = new WebDriverUtils(driver);
		//util.waitUntilWebElementIsAvailable(By.cssSelector("[href='adoption.html']"), 5);
		util.sleep(5);
		
		//3.  class --> class uses the dot operand (.)
		driver.findElement(By.cssSelector(".home")).click();
		Assert.assertTrue(driver.getTitle().equals("Zoo Adoption | Home"));
		
		//4.  attribute --> ["name of the attribute" = "value of the attribute"]
		driver.findElement(By.cssSelector("[href='adoption.html']")).click();
		Assert.assertTrue(driver.getTitle().equals("Adoption"));
		
		
	}
	
}
