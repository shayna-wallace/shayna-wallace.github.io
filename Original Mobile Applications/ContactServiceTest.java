import static org.junit.Assert.*;

import org.junit.Test;

public class ContactServiceTest {



	@Test
	public void testNewContact() {
		ContactService contactservice = new ContactService();
		contactservice.newContact("08","Jessica","Harris","14042185310","5916 Duren Field");
		contactservice.newContact("09","Kelly","Lewis","1048008989","24 Rue Fontaine");
	}

	@Test
	public void testDeleteContact() {
		ContactService contactservice = new ContactService();
		contactservice.deleteContact("09","Kelly","Lewis","1048008989","24 Rue Fontaine");
	}

	@Test
	public void testUpdateContact() {
		ContactService contactservice = new ContactService();
		contactservice.updateContact("07","Shayna","Lary","17708910040","6071 Cherokee Valley");
	}

}
