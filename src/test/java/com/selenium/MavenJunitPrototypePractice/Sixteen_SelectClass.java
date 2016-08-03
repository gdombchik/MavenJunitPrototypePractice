package com.selenium.MavenJunitPrototypePractice;

import org.junit.Test;
import org.junit.Assert;

import pageObjectZoo.AdoptionPage;

public class Sixteen_SelectClass extends AbstractWebDriver {
	
	@Test
	public void selectClass(){
		AdoptionPage adoptionPage = landingPage.navigateToAdoptionPage();
		Assert.assertTrue(driver.getTitle().equals("Adoption"));
		adoptionPage = adoptionPage.setSelectStartDate("fday");
		System.out.println(adoptionPage.getSelectStartDateValue());
		Assert.assertTrue(adoptionPage.getSelectStartDateValue().equals("fday"));
		adoptionPage.navigateToWebApp();
		Assert.assertTrue(driver.getTitle().equals("Zoo Adoption | Home"));
	}
}
