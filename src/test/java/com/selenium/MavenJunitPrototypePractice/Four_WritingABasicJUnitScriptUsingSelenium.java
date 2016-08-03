package com.selenium.mavenJunitPrototypePractice;

import org.junit.Assert;
import org.junit.Test;

public class Four_WritingABasicJUnitScriptUsingSelenium extends AbstractWebDriver {
	
	@Test
	public void shouldBeAbleToSeeTitleOnHomePage(){
		Assert.assertEquals("Zoo Adoption | Home", driver.getTitle());
	}
	
}
