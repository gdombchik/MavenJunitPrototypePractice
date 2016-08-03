package com.selenium.pageObjectZoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends AbstractPage {

	@FindBy(name = "nav_home")
	private WebElement homeLink;
	
	public AboutPage(WebDriver driver){
		super(driver);
	}
	
	public LandingPage navigateToHomePage(){
		homeLink.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}
}
