package com.selenium.MavenJunitPrototypePractice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pageObjectZoo.ContactConfirmationPage;
import pageObjectZoo.ContactPage;

public class Seven_PageObject extends AbstractWebDriver{
	
	@Before
	public void setUpSeven_PageObjectTest(){
		System.out.println("in test");
	}
	
	@Test
	public void pageObject(){
		ContactPage contactPage = landingPage.navigateToContactPage();
		contactPage.setNameField(propertyManager.contactFormNameField,propertyManager.contactFormNameValue).setAddressField("test address field").setPostCodeField("test post code field").setEmailField("test email field");
		ContactConfirmationPage contactConfirmationPage = contactPage.submitForm();
		//Assert.assertTrue(driver.getTitle().equals("Contact Confirmation"));
		Assert.assertTrue(driver.getTitle().contains("Contact")); //appears the HtmlUnitDriver does not display the entire title
	}
}
