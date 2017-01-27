package com.example.webguidemo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class HelionSteps {
	
	private final Pages pages;
	
	 private String email;
	 private static final String PASSWORD = "BezpieczneHaslo1*!";

	public HelionSteps(Pages pages) {
		this.pages = pages;
	}
	
	@Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();        
    }
 
    @When("user opens Sign up link")
    public void userClicksOnSignupLink(){        
        pages.home().clickSignupLink();
    }
 
    @Then("Sign up page is shown")
    public void signupPageIsShown(){
       assertEquals("Co zyskasz zak³adaj¹c konto w helion.pl? - Wydawnictwo Helion, ksiêgarnia internetowa informatyczna helion.pl", pages.signup().getTitle());
    }	
    
	@Given("user is on Sign up page")
    public void userIsOnSignupPage(){   
		pages.tenMinutesEmail().open();
		email = pages.tenMinutesEmail().getEmailAddress();
		pages.signup().open();   
    }
 
    @When("user signs up")
    public void userSignsup(){        
    	pages.signup().registerAs(email, PASSWORD); 
    }
 
    @Then("activation page is shown")
    public void activationPageIsShown(){
    	assertEquals("Co zyskasz zak³adaj¹c konto w helion.pl? - Wydawnictwo Helion, ksiêgarnia internetowa informatyczna helion.pl", pages.signup().getTitle());
    }
}
