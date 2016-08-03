package com.selenium.MavenJunitPrototypePractice;

import org.junit.Test;

import com.selenium.utils.WebDriverUtils;

import pageObjectZoo.AboutPage;
import pageObjectZoo.AdoptionPage;
import pageObjectZoo.ContactPage;
import pageObjectZoo.LandingPage;

public class Seventeen_TakingScreenshots extends AbstractWebDriver {

	@Test
	public void takingScreenshots(){
		WebDriverUtils util = new WebDriverUtils(driver);
		
		//home page screen shot
		util.takeStreenShot("homePage");
		
		AdoptionPage adoptionPage = landingPage.navigateToAdoptionPage();
		
		//adoption page screen shot
		util.takeStreenShot("adoptionPage");
		
		LandingPage landingPage = adoptionPage.navigateToHomePage();		
		AboutPage aboutPage = landingPage.navigateToAboutPage();
		
		//about page screen shot
		util.takeStreenShot("aboutPage");
		
		landingPage = aboutPage.navigateToHomePage();
		ContactPage contactPage = landingPage.navigateToContactPage();

		//contact page screen shot
		util.takeStreenShot("contactPage");
		
		contactPage.navigateToHomePage();
	}
	
	private void getTitle(){
		System.out.println(driver.getTitle());
	}
	
}
