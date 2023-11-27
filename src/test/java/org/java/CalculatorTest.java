package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator c = null;
	
	@BeforeEach 
	public void setUp() {
		c = new Calculator (0, 0);
	}
	
	@Test
	public void testAddizione() {
		c.setNum1(2);
		c.setNum2(3);
		assertEquals(5 /*numero aspettato*/, c.addizione(c.getNum1(), c.getNum2()), "Non ci sono errori");
	}
	
    @Test
    public void testSottrazione() {
		c.setNum1(2);
		c.setNum2(3);
		assertEquals(-1 /*numero aspettato*/, c.sottrazione(c.getNum1(), c.getNum2()), "Non ci sono errori");
    }
	
}
