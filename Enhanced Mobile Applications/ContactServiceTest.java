/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the JUnit test for the contact services. This test ensures that contact 
 * information can indeed be added, deleted, or updated.
**/



import org.junit.Test;

public class ContactServiceTest {

//These are a set of JUnit tests that will test the Contact Service class. We will test that we can
//add new contacts, update contacts, and delete contacts without errors or issues.

	//We add two contacts to the system
	@Test
	public void testNewContact() {
		ContactService contactservice = new ContactService();
		contactservice.newContact("08","Jessica","Cole","14042185510","5916 Duren Field");
		contactservice.newContact("09","Kelly","Lewis","1048008989","24 Rue Fontaine");
	}
   
	//We are now going to delete Kelly's contact information
	@Test
	public void testDeleteContact() {
		ContactService contactservice = new ContactService();
		contactservice.deleteContact("09","Kelly","Lewis","1048008989","24 Rue Fontaine");
	}
    
	//We are going to update Jessica's last name and home address
	@Test
	public void testUpdateContact() {
		ContactService contactservice = new ContactService();
		contactservice.updateContact("08","Jessica","Lary","14042185510","6071 Cherokee Valley");
	}

}
