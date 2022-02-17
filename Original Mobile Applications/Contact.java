
public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
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
	
	
