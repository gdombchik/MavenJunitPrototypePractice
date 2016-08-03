package com.selenium.pageObjectZoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdoptionPage extends AbstractPage{

	@FindBy(name = "nav_home")
	private WebElement homeLink;
	
	@FindBy(id = "start_select")
	private WebElement startDateDropDown;
	
	public AdoptionPage(WebDriver driver){
		super(driver);
	}
	
	public LandingPage navigateToHomePage(){		
		homeLink.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}
	
	public AdoptionPage setSelectStartDate(String value){
		//System.out.println(startDateDropDown.getAttribute("value"));
		
		Select select = new Select(startDateDropDown);
		
		select = new Select(startDateDropDown);
		//select.selectByIndex(2);
		select.selectByValue(value);
		//System.out.println(startDateDropDown.getAttribute("value"));
		
		return PageFactory.initElements(driver, AdoptionPage.class);
	}
	
	public String getSelectStartDateValue(){
		return startDateDropDown.getAttribute("value");
	}
}
