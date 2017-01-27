package com.example.webguidemo.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home extends WebDriverPage {
	
	
		private final static String LOGIN_LINK_TEXT = "Zaloguj siê";
		private final static String SIGNUP_LINK_TEXT = "Za³ó¿ konto";

	public Home(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	public void open() {
		get("http://helion.pl/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void clickSignupLink(){
		findElement(By.linkText(LOGIN_LINK_TEXT)).click();
		findElement(By.linkText(SIGNUP_LINK_TEXT)).click();
	}
}
