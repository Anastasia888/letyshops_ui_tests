package com.letyshops.ui;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;

public class ConfirmCountryPage {
	
	private static SelenideElement changeCountry=$(".b-select-location__select");
	private static SelenideElement selectCountry=$(By.xpath("//li[contains(@class,'multi sprite-flag br')]"));
	private static SelenideElement submitCountryButton=$("#location-submit-button");
	
	public static void selectAndSubmitCountry() {
		changeCountry.shouldBe(visible).click();
		selectCountry.shouldBe(visible).click();
		submitCountryButton.shouldBe(visible).click();		
	}

}
