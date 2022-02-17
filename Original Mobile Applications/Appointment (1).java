import java.time.LocalDate;

public class Appointment {
	
	private String appointmentID;
	private LocalDate appointmentDate;
	private String Description;
	
	
	
	public Appointment(String appointmentID, LocalDate appointmentDate, String Description) throws Exception {
		if (appointmentID == null || appointmentID.length()>10) {
			throw new IllegalArgumentException("Invaild appointmentID");
		}
		if (appointmentDate == null)  {
			throw new IllegalArgumentException("Appointment date cannot be null");
		}else if (before(LocalDate(2021, 04, 11))){
			throw new Exception("Appointment cannot be made in past");
		}
		if (Description == null || Description.length()>50) {
			throw new IllegalArgumentException("Invaild Description");
		
		
		}
	}


	

	

   private java.time.LocalDate LocalDate(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}










private boolean before(java.time.LocalDate localDate2) {
	return false;
   
		
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




}




