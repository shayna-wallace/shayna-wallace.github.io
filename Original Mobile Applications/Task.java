
public class Task {
	
	private String taskID;
	private String Name;
	private String Description;
	
	
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
