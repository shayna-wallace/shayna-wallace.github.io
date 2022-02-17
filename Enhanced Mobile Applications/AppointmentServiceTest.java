/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the JUnit test for the appointment services and makes sure the 
 * customer can indeed add, update, and delete appointments they have set.
**/

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;



//This is a set of JUnit tests and will test that a potential customer can add, update, 
//or delete their appointments.
public class AppointmentServiceTest {
	
	Date today = new Date();

	 
    //We are going to add an appointment to the system.
	@Test
	public void testAddAppointment() {
	
		AppointmentService.addAppointment("70", LocalDate(), "Get car tires changed");
	
	}
	
	//We are now going to update the type of appointment. Above it was change tires
	//and now it is get oil changed.
	@Test 
	public void testUpdateAppointment() {
	
		AppointmentService.updateAppointment("70", LocalDate(), "Get oil changed");
	
	}



	private LocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}


    //We are now going to delete the appointment for get oil changed.
	@Test
	void testDeleteAppointment() {
		AppointmentService.deleteAppointment("70", LocalDate(), "Get oil changed");
		
	}

}
