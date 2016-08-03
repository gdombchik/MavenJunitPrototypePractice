package com.selenium.pageObjectZoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends AbstractPage{
	
	@FindBy(name = "nav_home")
	private WebElement homeLink;

	public ContactPage(WebDriver driver){
		super(driver);
	}
	
	public ContactPage setNameField(String name,String value){
		driver.findElement(By.name(name)).sendKeys(value);
		return new ContactPage(driver);
	}
	
	public ContactPage setAddressField(String addressField){
		driver.findElement(By.name("address_field")).sendKeys(addressField);
		return new ContactPage(driver);
	}
	
	public ContactPage setPostCodeField(String postCodeField){
		driver.findElement(By.name("postcode_field")).sendKeys(postCodeField);
		return new ContactPage(driver);
	}
	
	public ContactPage setEmailField(String emailField){
		driver.findElement(By.name("email_field")).sendKeys(emailField);
		return new ContactPage(driver);
	}
	
	public ContactConfirmationPage submitForm(){
		driver.findElement(By.id("submit_message")).click();
		return new ContactConfirmationPage(driver);
	}
	
	public LandingPage navigateToHomePage(){
		//driver.findElement(By.id(link + "_link")).click();
		//return new LandingPage(driver);
		
		//Using the PageFactory pattern
		homeLink.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}
}
