import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContactTest {

	@Test
	public void testContact() {
		Contact contact = new Contact("07","Shayna","Wallace","17708910040","77 Decatur Ave");
		assertTrue(contact.getcontactID().equals("07"));
		assertTrue(contact.getfirstName().equals("Shayna"));
		assertTrue(contact.getlastName().equals("Wallace"));
		assertTrue(contact.getphone().equals("17708910040"));
		assertTrue(contact.getaddress().equals("77 Decatur Ave"));
	}
	
	@Test
	public void testContactToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("07","Shayna","Wallace","7708910040","77 Decatur Ave");
		}); }
	}
	
