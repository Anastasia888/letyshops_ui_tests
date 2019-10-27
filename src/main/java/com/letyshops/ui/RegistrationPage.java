package com.letyshops.ui;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

public class RegistrationPage {
	
private static SelenideElement userEmail=$("input[name='_username']");
private static SelenideElement userPassword=$("input[name='_password']");
private static SelenideElement submitButton=$(".welcome-module-auth__action-button");

public static ConfirmCountryPage registrationOnWebSite(String email, String password) {
	userEmail.setValue(email);
	userPassword.scrollTo().setValue(password);
	submitButton.click();
	return new ConfirmCountryPage();	
}

}
