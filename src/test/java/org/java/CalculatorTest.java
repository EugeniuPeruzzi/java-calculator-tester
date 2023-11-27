package org.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator c = null;
	
	@BeforeEach 
	public void setUp() throws Exception {
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
    
    @Test
    public void testDivisioneThrows() throws Exception {
		c.setNum1(10);
		c.setNum2(0);
		//assertThrows(Exception.class, () -> c.divisione(c.getNum1(), c.getNum2()));
		assertThrows(Exception.class, ()-> c.divisione(c.getNum1(), c.getNum2()), "eccezione attesa con num2 = 0" );
    }
    
    @Test
    public void testDivisioneNotThrows() throws Exception {
		c.setNum1(10);
		c.setNum2(2);
		//assertThrows(Exception.class, () -> c.divisione(c.getNum1(), c.getNum2()));
		//assertThrows(Exception.class, ()-> c.divisione(c.getNum1(), c.getNum2()), "eccezione attesa con num2 = 0" );
		assertDoesNotThrow(() -> c.divisione(c.getNum1(), c.getNum2()), "Eccezione generata");
    }
    
    @Test
    public void testMoltiplicaizone() {
		c.setNum1(10);
		c.setNum2(2);
		assertEquals(20 /*numero aspettato*/, c.moltiplicazione(c.getNum1(), c.getNum2()), "Non ci sono errori");
    }
	
	
}
