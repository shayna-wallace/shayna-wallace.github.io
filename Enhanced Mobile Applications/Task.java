/**
 * Task Mobile Application - Can be used for users to set up tasks they need to complete
 * 
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the requirements for the task being created.
**/

public class Task {
	
	//The attributes for the Task class
	private String taskID;
	private String Name;
	private String Description;
	
	//The requirements for the attributes - these must be meet 
	public Task(String taskID, String Name, String Description) {
		if (taskID == null || taskID.length()>10) {
			throw new IllegalArgumentException("Invaild taskID");
		}
		if (Name == null || Name.length()>20) {
			throw new IllegalArgumentException("Invaild Name");
	    }
		if (Description == null || Description.length()>50) {
			throw new IllegalArgumentException("Invaild Description");
		}
		
		
		this.taskID = taskID;
		this.Name = Name;
		this.Description = Description;
		
	}
	
	public String gettaskID(){
		return taskID;
	}
	public String getName(){
		return Name;
	}
	public String getDescription(){
		return Description;
	}
	
	


}
