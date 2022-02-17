/**
 * Contact Mobile Application - Can be used for users to add contact info in the phone or even for
 * businesses to set up their customers information
 * 
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the requirements for the contacts information being created
**/


public class Contact {
	
	//These are our attributes of the contact class. We will need this information for the mobile
	//application
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	//These are our requirements for the contact class and they must be meet or an exception
	//will be throw.
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invaild ContactID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invaild firstName");
	    }
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invaild lastName");
		}
		if (phone == null || phone.length()==10) {
			throw new IllegalArgumentException("Invaild phone");
		}
		if (address == null || contactID.length()>30) {
			throw new IllegalArgumentException("Invaild address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	public String getcontactID(){
		return contactID;
	}
	public String getfirstName(){
		return firstName;
	}
	public String getlastName(){
		return lastName;
	}
	public String getphone(){
		return phone;
	}
	public String getaddress(){
		return address;
	}

}
	