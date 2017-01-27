package com.example.webguidemo;

import org.jbehave.web.selenium.WebDriverProvider;

import com.example.webguidemo.pages.Signup;
import com.example.webguidemo.pages.TenMinutesEmail;
import com.example.webguidemo.pages.Home;

public class Pages {

	private WebDriverProvider driverProvider;
	
	//Pages
	private Home home;
	private Signup register;
	private TenMinutesEmail tenMinutesEmail;
	// ...

	public Pages(WebDriverProvider driverProvider) {
		super();
		this.driverProvider = driverProvider;
	}

	public Home home() {
		if (home == null) {
			home = new Home(driverProvider);
		}
		return home;
	}
	
	public Signup signup(){
		if (register == null) {
			register = new Signup(driverProvider);
		}
		return register;
	}
	
	public TenMinutesEmail tenMinutesEmail() {
		if (tenMinutesEmail == null) {
			tenMinutesEmail = new TenMinutesEmail(driverProvider);
		}
		return tenMinutesEmail;
	}
}
