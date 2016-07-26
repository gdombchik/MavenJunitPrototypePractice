package com.cucumber.MavenJunitPrototypePractice;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four_WritingABasicJUnitScriptUsingSelenium {

	WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new ChromeDriver();
		driver.navigate().to("http://www.thetestroom.com");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void shouldBeAbleToSeeTitleOnHomePage(){
		Assert.assertEquals("The Test Room - Video tutorial series on Cucumber, Selenium, Protractor and much more", driver.getTitle());
	}
	
}
