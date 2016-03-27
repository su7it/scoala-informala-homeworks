package ro.sci.bookStore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCustomer {
	List<Customer> customer = null;

	@Before
	public void initCustomer() {
		customer = new ArrayList<Customer>();
		customer.add(AddNewCustomer("John", "Ferdinand street, 21", "john.t@gmail.com", 1));

	}

	@Test
	public void testCustomerSize() {

		assertNotNull(customer);
		assertTrue(customer.size() > 0);
		assertFalse(customer.size() < 0);

	}

	@Test
	public void testCustomerContent() {
		Customer customer = new Customer();
		assertEquals("John", customer.getName());
		assertNotEquals(2, customer.getCart());
		assertNull(customer.hashCode());
	}

	private Customer AddNewCustomer(String name, String adress, String email, int cart) {
		Customer customer = new Customer();
		customer.setAdress(adress);
		customer.setCart(100);
		customer.setName(name);
		customer.setEmail(email);
		return customer;
	}

	@After
	public void Destroy() {
		customer = null;
	}

}
