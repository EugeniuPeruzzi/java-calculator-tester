package org.java;

public class CalculatorTest {
	private Calculator c = null;
	
	@BeforeEach 
	public void setUp() {
		c = new Calculator (2, 3);
	}
}
