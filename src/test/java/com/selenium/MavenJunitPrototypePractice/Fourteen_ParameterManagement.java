package com.selenium.MavenJunitPrototypePractice;

import org.junit.Test;

import pageObjectZoo.ContactPage;

public class Fourteen_ParameterManagement extends AbstractWebDriver{
	
	@Test
	public void parameterManagement(){
		//Click on the contact page
		ContactPage contactPage = landingPage.navigateToContactPage();
		contactPage.setNameField(propertyManager.contactFormNameField,propertyManager.contactFormNameValue);
		System.out.println(propertyManager.contactFormNameField);
		System.out.println(propertyManager.contactFormNameValue);
	}
	
}
