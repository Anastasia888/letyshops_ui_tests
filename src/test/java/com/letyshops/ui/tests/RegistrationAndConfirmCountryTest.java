package com.letyshops.ui.tests;

import com.letyshops.ui.Generator;
import com.letyshops.ui.RegistrationPage;
import com.letyshops.ui.ConfirmCountryPage;
import com.codeborne.selenide.junit.ScreenShooter;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationAndConfirmCountryTest {
	
	@Rule
	public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();
	@Before
	public void setUp() {
		Configuration.startMaximized=true;
		open("https://letyshops.com");
		Configuration.reportsFolder = "resources";
	}
		
	@Test
	public void RegistrateAndConfirmCountry() {	
		RegistrationPage.registrationOnWebSite(Generator.generateEmail(),"7rteewewd");
		ConfirmCountryPage.selectAndSubmitCountry();	
	}	
}
