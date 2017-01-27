package com.example.webguidemo.pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class TenMinutesEmail extends WebDriverPage {


	public TenMinutesEmail(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	public void open() {
		get("https://10minutemail.com/");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public String getEmailAddress(){
		return findElement(By.id("mailAddress")).getAttribute("value");
	}
	
	public String getUserName(){
		return "user" + Math.random()*1000;
	}

}
