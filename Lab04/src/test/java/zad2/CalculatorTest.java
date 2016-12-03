package zad2;

import static org.junit.Assert.*;
import org.junit.Test;
import zad2.Calculator;

public class CalculatorTest {

	//SUT
	Calculator calculator = new Calculator();
	
	@Test
	public void addCheck() {
		assertEquals(5.26, calculator.add(2.13,3.13), 0.01);
	}

	@Test
	public void subCheck() {
		assertEquals(0.78, calculator.sub(3.05,2.27), 0.01);
	}
	
	@Test
	public void multiCheck() {
		assertEquals(64.7451, calculator.multi(7.17,9.03), 0.01);
	}
	
	@Test
	public void divCheck() {
		assertEquals(2.75490196078431, calculator.div(5.62,2.04), 0.01);
	}
	
	@Test 
	public void divByZeroCheck() {
		assertEquals(0.00, calculator.div(3.14, 0.00), 0.01);
	}
	
	@Test
	public void greaterCheck() {
		assertEquals(false, calculator.greater(12.33, 12.351));
	}
}
