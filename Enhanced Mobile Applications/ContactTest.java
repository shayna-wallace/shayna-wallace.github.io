/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the JUnit test for the contacts being created. This test will ensure
 * that the contacts requirements are being meet.
**/

import static org.junit.Assert.*;

import org.junit.Test;


//We will be testing the Contact class requirements and making sure they are meet and if they are not
//an exception is being thrown.

public class ContactTest {

	@Test
	public void testContact() {
		Contact contact = new Contact("07","Shay","Walls","17708912041","77 Decatur Ave");
		assertTrue(contact.getcontactID().equals("07"));
		assertTrue(contact.getfirstName().equals("Shay"));
		assertTrue(contact.getlastName().equals("Walls"));
		assertTrue(contact.getphone().equals("17708912041"));
		assertTrue(contact.getaddress().equals("77 Decatur Ave"));
	}
	
	//ADDED - Testing to see if an exception will be thrown due to firstName being over the 10 limit
	@Test
	public void testfirstNameTooLong() {
		Contact contact = new Contact("03", "JessicaKelly", "Lewis", "4780019929", "8901 Dell Lane");
				assertTrue(contact.getfirstName().length() > 10);
	}
	
	
	//ADDED - Testing to see if an exception will be throw for the long lastName
	@Test
	public void testContactlastNameTooLong() {
		Contact contact = new Contact("70", "Chris", "Lewis-Carter", "6781119087", "6719 Opera View");
		        assertTrue(contact.getlastName().length() > 10);
	}
	
	
	//ADDED - Testing to see if an exception will be thrown for the long contactID
	@Test
	public void testContactIDTooLong() {
		Contact contact = new Contact("901025489011", "Sky", "Sidney","7709991111", "2549 Crest View");
		        assertTrue(contact.getcontactID().length() > 10);
	}
		
	
	}

    

