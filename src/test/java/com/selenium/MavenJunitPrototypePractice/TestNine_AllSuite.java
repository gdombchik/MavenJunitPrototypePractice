package com.selenium.mavenJunitPrototypePractice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Four_WritingABasicJUnitScriptUsingSelenium.class,
	Five_WebDriverLocators.class,
	Six_WebDriverAssertions.class,
	Seven_PageObject.class,
	//Eight is the AbstractWebDriverTest.  Do not run individually.
	Ten_WebDriverXPath.class,
	Eleven_CssSelector.class,
	Twelve_PopUpsAndWindows.class,  //can not be used with HtmlUnitDriver
	Thirteen_Collections.class,
	Fourteen_ParameterManagement.class,
	Fifteen_PageFactory.class,
	Sixteen_SelectClass.class,
	Seventeen_TakingScreenshots.class, //can not be used with HtmlUnitDriver
	Eighteen_HeadlessBrowser.class
	//Extra comment.
})

public class TestNine_AllSuite {
	
}
