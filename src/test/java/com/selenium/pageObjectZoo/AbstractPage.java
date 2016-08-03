package com.selenium.pageObjectZoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}
	
	public LandingPage navigateToWebApp(){
		driver.navigate().to("http://www.thetestroom.com/webapp");
		//return new LandingPage(driver);
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public void closeDriver(){
		driver.quit();
	}
}
