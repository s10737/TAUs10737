package zad1ab;

import static org.junit.Assert.*;
import org.junit.Test;
import zad1ab.Calculator;

public class CalculatorTest {

	//SUT
	Calculator calculator = new Calculator();
	
	@Test
	public void addCheck() {
		assertEquals(5, calculator.add(2,3));
	}

	@Test
	public void subCheck() {
		assertEquals(1, calculator.sub(3,2));
	}
	
	@Test
	public void multiCheck() {
		assertEquals(6, calculator.multi(3,2));
	}
	
	@Test
	public void divCheck() {
		assertEquals(2, calculator.div(4,2));
	}
	
	@Test 
	public void divByZeroCheck() {
		assertEquals(0, calculator.div(3, 0));
	}
	
	@Test
	public void greaterCheck() {
		assertEquals(true, calculator.greater(30, 2));
	}
}
