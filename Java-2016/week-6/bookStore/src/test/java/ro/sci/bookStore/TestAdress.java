package ro.sci.bookStore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestAdress {
	Adress adress = null;

	@Before
	public void initAdress() {

		adress = new Adress("Ferdinand", "Cluj - Napoca", 22);
	}

	@Test
	public void testAdressContent() {
		assertTrue(null, true);
		assertNotNull(adress);
		assertEquals(22, adress.getNumber());
		assertNotEquals("Cluj - Napoca", "Dej");
	}
	
	@Test
	public void testAdress(){
		assertEquals("Ferdinand", adress.getStreet());
		assertNull(null);
		assertFalse(false);
	}
	@After
	public void Destroy(){
		adress = null;
	}

}
