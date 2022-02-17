
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;



public class AppointmentServiceTest {
	
	Date today = new Date();

	 

	@Test
	public void testAddAppointment() {
	
		AppointmentService.addAppointment("70", LocalDate(), "Get car tires changed");
	
	}



	private LocalDate LocalDate() {
		// TODO Auto-generated method stub
		return null;
	}



	@Test
	void testDeleteAppointment() {
		AppointmentService.deleteAppointment("70", LocalDate(), "Get car tires changed");
		
	}

}
