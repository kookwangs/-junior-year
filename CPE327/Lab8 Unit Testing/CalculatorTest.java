package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator;
	double inf = Double.POSITIVE_INFINITY;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void testCalculator() {
		assertEquals(inf,calculator.divide(5,0),0.1);
	}

}
