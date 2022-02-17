/**
 * Appointment Mobile Application - Can be used by a business to have their customers set
 * up appointments.
 * 
 * This program was created for a mobile application and to test the requirements
 * to make sure all the requirements have been meet and passes.
 * This class houses the requirements for the appointments being created
**/
import java.time.LocalDate;


public class Appointment {
	
	//These are the attributes of our Appointment class. We will need them for the mobile 
	//application and for the application to function successfully.
	private String appointmentID;
	private LocalDate appointmentDate;
	private String Description;
	
	
	//Below is the requirements for appointment ID's, Date, and Description. If these
	//requirements are not meet it will not allow the user to save and will display a message.
	
	public Appointment(String appointmentID, LocalDate appointmentDate, String Description) throws Exception {
		if (appointmentID == null || appointmentID.length()>10) {
			throw new IllegalArgumentException("Invaild appointmentID");
		}
		if (appointmentDate == null)  {
			throw new IllegalArgumentException("Appointment date cannot be null");
		}
		else if (before(LocalDate(2021, 04, 11))){
			throw new IllegalArgumentException("Appointment cannot be made in past");
		}
		if (Description == null || Description.length()>50) {
			throw new IllegalArgumentException("Invaild Description");
		
		}
	}
	
	public String getappointmentID(){
		return appointmentID;
	}
	
	public LocalDate getappointmentDate(){
		return appointmentDate;
	}
	
	public String getDescription(){
		return Description;
	}



private java.time.LocalDate LocalDate(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}




private boolean before(java.time.LocalDate localDate2) {
	return false;
   
		
	}









}




