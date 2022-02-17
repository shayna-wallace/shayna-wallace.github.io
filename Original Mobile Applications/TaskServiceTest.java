import org.junit.Test;

public class TaskServiceTest {


	@Test
	public void testAddTask() {
		new TaskService();
		TaskService.addTask("08","Assignment","Start new school project");
		TaskService.addTask("30", "Excercise", "Go to gym and run treadmill");
	}

	@Test
	public void testDeleteTask() {
		new TaskService();
		TaskService.deleteTask("08", "Assignment","Start new school project");
	}

	@Test
	public void testUpdateTask() {
		new TaskService();
		TaskService.updateTask("30", "Excercise", "Go to gym and do stairmaster");
		
	
	}

}
