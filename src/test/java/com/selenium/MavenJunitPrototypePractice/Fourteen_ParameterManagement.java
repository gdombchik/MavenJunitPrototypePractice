package com.selenium.mavenJunitPrototypePractice;

import org.junit.Test;

import com.selenium.pageObjectZoo.ContactPage;

public class Fourteen_ParameterManagement extends AbstractWebDriver{
	
	@Test
	public void parameterManagement(){
		//Click on the contact page
		ContactPage contactPage = landingPage.navigateToContactPage();
		contactPage.setNameField(propertyManager.getContactFormNameField(),propertyManager.getContactFormNameValue());
		System.out.println(propertyManager.getContactFormNameField());
		System.out.println(propertyManager.getContactFormNameValue());
	}
	
}
