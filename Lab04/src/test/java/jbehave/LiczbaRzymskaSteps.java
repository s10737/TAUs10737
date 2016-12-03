package jbehave;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class LiczbaRzymskaSteps {

	private LiczbaRzymska liczbaRzymska;
	
	@Given("a liczbaRzymska with argument $liczba")
	public void liczbaRzymskaSetup(int liczba) {
			liczbaRzymska = new LiczbaRzymska(liczba);
	}
	@Then("the result should be $roman")
	public void ShouldBeString(String roman){
		assertEquals(roman, liczbaRzymska.toString());
	}
}
