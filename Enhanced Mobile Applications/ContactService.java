/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the requirements for the contact services and makes sure the customers
 * can add, delete, or update their contact information.
**/

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
	
	//We will need to be able to add new contacts, delete contacts, and update contacts.
	
	 public void newContact(String ContactID,String firstName, String lastName, String phone, String address) {
	 }

	 public void deleteContact(String ContactID,String firstName, String lastName, String phone, String address) {
	 }
	 
	 public void updateContact(String ContactID,String firstName, String lastName, String phone, String address) {
	 }
	 

	

}