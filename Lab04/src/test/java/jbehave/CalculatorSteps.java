package jbehave;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps {

	private Calculator calc;
	
	@Given("a calculator")
	public void calulatorSetup(){
		calc = new Calculator();
	}
	
	@When("set arguments to $a and $b")
	public void setArguments(int a, int b){
		calc.setA(a);
		calc.setB(b);
	}
	
    @Then("adding should return $result")
	public void shouldAdd(int result){
		assertEquals(result, calc.add());
	}
    
    @Then("subtracting should return $result")
  	public void shouldSubstract(int result){
  		assertEquals(result, calc.sub());
  	}
    
    @Then("multiplying should return $result")
    public void shouldMultiply(int result) {
    	assertEquals(result, calc.multi());
    }
    
    @Then("division should return $result")
    public void shouldDivide(int result) {
    	assertEquals(result, calc.div());
    }
    
    @Then("greater should return $result")
    public void shouldCompare(boolean result) {
    	assertEquals(result, calc.greater());
    }
}
