package ro.sci.bookStore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCart {
	
	List<Cart> cart = null;

	@Before
	public void initCart() {
		cart = new ArrayList<Cart>();
		cart.add(Products("Phone", 740));
	}

	
	private Cart Products(String list, float totalPrice) {
		Cart cart = new Cart(list, totalPrice);
		cart.setList(list);
		cart.setTotalPrice(totalPrice);
		return cart;
	}


	@Test
	public void testCartSize() {

		assertNotNull(cart);
		assertTrue(cart.size() > 0);
		assertFalse(cart.size() < -1);

	}
	@Test
	public void testCart(){
		Cart cart2 = new Cart("Phone", 750);
		assertEquals(cart2.getList(), "Phone");
		assertNotEquals(760, cart2.getTotalPrice());
		
		
	}
	}


