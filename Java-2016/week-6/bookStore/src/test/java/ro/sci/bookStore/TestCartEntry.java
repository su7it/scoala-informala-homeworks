package ro.sci.bookStore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCartEntry {
	List<Book> book = null;

	@Before
	public void initCartEntry() {
		book = new ArrayList<Book>();
		book.add(AddNewBook("Four", 1));
		}
		
		
		private Book AddNewBook(String book, float quantity) {
		Book b = new Book(1);
		return b;
	}


		@Test
		public void testCartEntry() {

			assertNotNull(book);
			assertTrue(book.size() > 0);
			assertFalse(book.size() <0 );
	}
		@Test
		public void testCartEntryContent(){
			assertEquals("The four", book.getBook());
			assertNotEquals(null, "Four");
		}

}
