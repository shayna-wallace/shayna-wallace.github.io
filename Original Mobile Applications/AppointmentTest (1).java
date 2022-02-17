import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppointmentTest{
	


	public void Appointment(String appointmentID, Date appointmentDate, String Description) {
	}
	
	Date today = new Date();
	
	@Test
	public void testappointment() throws Exception {
	
		Appointment appointment = new Appointment("90", LocalDate(), "Get car oil changed");
		assertTrue(appointment.getappointmentID().equals("90"));
		assertTrue(appointment.getappointmentDate().equals(LocalDate()));
		assertTrue(appointment.getDescription().equals("Get car oil changed"));
		
	}
	


	@Test
	public void testAppointmentToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			
			new Appointment("90128764597220", LocalDate(), "Get car oil changed");
		}); }



	private LocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
