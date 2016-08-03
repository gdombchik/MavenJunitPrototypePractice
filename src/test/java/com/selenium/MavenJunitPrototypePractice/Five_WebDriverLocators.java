package com.selenium.mavenJunitPrototypePractice;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Five_WebDriverLocators extends AbstractWebDriver {
	
	@Test
	public void webDriverLocators(){
		/*driver.navigate().to("http://www.google.com");
		WebElement webElement = driver.findElement(By.name("q"));
		webElement.sendKeys("selenium");
		System.out.println("dfasdf" + webElement.getText());
		//webElement.submit();
		//Assert.assertTrue(webElement.get);
		*/
		
		//---Locators--
		//1.  By ID (the preferred method)
		driver.findElement(By.id("contact_link")).click();
		
		//2.  By className
		WebElement subheadElement = driver.findElement(By.className("subhead"));
		Assert.assertTrue(subheadElement.getText().equals("Contact Form"));
		
		//3.  By name
		WebElement enterNameElement = driver.findElement(By.name("name_field"));
		enterNameElement.sendKeys("Greg");
		
		//4.  By CSS
		//http://artoftesting.com/automationTesting/cssSelector.html
		//driver.findElement(By.cssSelector("#adoption_link")).click();
		driver.findElement(By.cssSelector("[id=adoption_link]")).click();
		//System.out.println(driver.findElements(By.cssSelector("[class=record]")).size());
		List<WebElement> elements = driver.findElements(By.cssSelector(".record"));
		System.out.println(elements.get(0).getText());
		
		//5.  By LinkText
		
		//6.  By Partial LinkText
		
		//7.  By XPath
		//http://slesinsky.org/brian/code/xpath_checker.html
		//In Firefox, right click on item on web page and select “View XPath”
		
		//http://learn-automation.com/how-to-write-dynamic-xpath-in-selenium/
		
		driver.findElement(By.xpath("//*[@id='contact_link']")).click();		
		driver.findElement(By.xpath("id('home_link')")).click();;
	}
	
}
