import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	
	private List<Contact> contactList = new ArrayList<>();
	
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
	 public void newContact(String ContactID,String firstName, String lastName, String phone, String address) {
         
}

	 public void deleteContact(String ContactID,String firstName, String lastName, String phone, String address) {
	} 
	 
	 public void updateContact(String ContactID,String firstName, String lastName, String phone, String address) {
		}

	

}