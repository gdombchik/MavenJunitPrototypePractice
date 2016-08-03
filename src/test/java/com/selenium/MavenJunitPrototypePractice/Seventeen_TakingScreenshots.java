package com.selenium.mavenJunitPrototypePractice;

import org.junit.Test;

import com.selenium.pageObjectZoo.AboutPage;
import com.selenium.pageObjectZoo.AdoptionPage;
import com.selenium.pageObjectZoo.ContactPage;
import com.selenium.pageObjectZoo.LandingPage;
import com.selenium.utils.WebDriverUtils;

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
