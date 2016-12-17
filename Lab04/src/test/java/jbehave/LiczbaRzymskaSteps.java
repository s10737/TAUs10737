package jbehave;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class LiczbaRzymskaSteps {

	private LiczbaRzymska roman;
	
	@Given("a number $liczba")
	public void liczbaRzymskaSetup(int liczba){
		roman = new LiczbaRzymska(liczba);
	}
	
    @Then("we should get a roman number $result")
	public void liczbaRzymskaResult(String result){
    	assertEquals(result, roman.toString());
	}
    
    @Given("a wrong number $liczba")
	public void wrongLiczbaRzymskaSetup(int liczba){
		roman = new LiczbaRzymska(liczba);
	}
	
    @Then("we should get a message $result")
	public void wrongliczbaRzymskaResult(String result){
    	assertEquals(result, roman.toString());
	}
}
