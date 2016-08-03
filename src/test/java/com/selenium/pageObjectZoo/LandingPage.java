package com.selenium.pageObjectZoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractPage{
	
	@FindBy(name = "nav_contact")
	private WebElement contactLink;
	
	@FindBy(name = "nav_adopt")
	private WebElement adoptionLink;
	
	@FindBy(name = "nav_about")
	private WebElement aboutLink;
	
	public LandingPage(WebDriver driver){
		super(driver);
	}
	
	public ContactPage navigateToContactPage(){
		//Not using PageFactory pattern
		/*driver.findElement(By.id(link + "_link")).click();
		return new ContactPage(driver);*/
		
		//Using PageFactory pattern
		contactLink.click();
		return PageFactory.initElements(driver, ContactPage.class);
	}
	
	public AdoptionPage navigateToAdoptionPage(){
		adoptionLink.click();
		return PageFactory.initElements(driver, AdoptionPage.class);
	}
	
	public AboutPage navigateToAboutPage(){
		aboutLink.click();
		return PageFactory.initElements(driver, AboutPage.class);
	}
	
}
