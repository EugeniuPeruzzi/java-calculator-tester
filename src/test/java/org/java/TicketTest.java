package org.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {
//	private Ticket t = null;
//	
//	@BeforeEach
//	public void setUp() throws Exception{
//		t = new Ticket(0, 0);
//	}
//	
	@Test
	public void testKmThrowsException() {
	    assertThrows(Exception.class, () -> {
	        new Ticket(-1, -1);
	    });
	}
	
	@Test
	public void testKmNotThrowsException() {
	    assertDoesNotThrow(() -> {
	        new Ticket(100, 10);
	    });
	}
	
	@Test
	public void priceTicketTest() throws Exception {
		Ticket ticket = new Ticket(100, 17);
        assertEquals(16.8, ticket.calculatePrice(), "Nessun errore");

        ticket = new Ticket(100, 66);
        assertEquals(12.6, ticket.calculatePrice(), "Nessun errore");

        ticket = new Ticket(100, 25);
        assertEquals(21, ticket.calculatePrice(), "Nessun errore");
	}

}
