package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Signup extends WebDriverPage{
	
	 private static final By INPUT_EMAIL = By.id("email");
	 private static final By INPUT_PASSWORD = By.id("haslo1");
	 private static final By INPUT_CONFIRM_PASSWORD = By.id("haslo2");
	 private static final By FLAG_ALL = By.linkText("Zaznacz wszystko");
	 private static final By SIGNUP = By.xpath("//*[@id='rejestracja']/fieldset/p[3]/button");

	
	public Signup(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("https://helion.pl/users/rejestracja.cgi");
		manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	 public void registerAs(String email, String password) {
		 findElement(INPUT_EMAIL).sendKeys(email);
		 findElement(INPUT_PASSWORD).sendKeys(password);
		 findElement(INPUT_CONFIRM_PASSWORD).sendKeys(password);
		 findElement(FLAG_ALL).click();
		 findElement(SIGNUP).submit();
		    } 
		 }
