package com.cucumber.MavenJunitPrototypePractice;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import PropertyManager.PropertyManager;
import pageObjectZoo.LandingPage;

/*
 * Can be used by all tests that use the Selenium WebDriver.
 * 1.  Junit Before and After
 * 2.  Starting Point.  In this example the LandingPage object
 */
public abstract class AbstractWebDriver extends AbstractPageStepDefinition{
	
	protected WebDriver driver;
	protected LandingPage landingPage;
	protected PropertyManager propertyManager;
	
	@Before
	public void setUp(){
		//System.out.println("in abstract");
		propertyManager = new PropertyManager();
		propertyManager.generateProperty();
		driver = getWebdriver();
		landingPage = new LandingPage(driver).navigateToWebApp();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
