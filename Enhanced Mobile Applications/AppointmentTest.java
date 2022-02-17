/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the JUnit test for the appointment requirements. This test makes sure
 * that the lengths are being meet and no field is left blank/null.
**/


import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Date;

//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//We will now test the requirements for the mobile application.
public class AppointmentTest{
	

	Date today = new Date();
	
	//UPDATED - This test will test to see if the Date is missing. If missing an exception will be thrown.
	@Test
	public void testAppointmentDateMissing() throws Exception {
	
		Appointment appointment = new Appointment("90", LocalDate(), "Get car oil changed");
		assertTrue(appointment.getappointmentID().equals("90"));
		assertTrue(appointment.getappointmentDate().equals(LocalDate()));
		assertTrue(appointment.getDescription().equals("Get car oil changed"));
		
	}
	
	
	//ADDED - We are to check to see if an exception will be thrown due to the AppointmentID
	//being longer then the 10 character limit.
	@Test
	public void testAppointmentIDTooLong() throws Exception {
		Appointment appointment = new Appointment("123456789101", LocalDate(), "Get new tires");
				assertTrue(appointment.getappointmentID().length() > 10);
	}
	
	

	@Test
	public void testAppointment() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("90128764597220", LocalDate(), "Get car oil changed");
		}); 
		
	}
		
		

	private LocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
