/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the JUnit tests for the task services. These test ensure that tasks can
 * indeed be added, deleted, and updated.
**/

import org.junit.Test;

public class TaskServiceTest {


	//We are testing to see if we can add task to the system
	@Test
	public void testAddTask() {
		new TaskService();
		TaskService.addTask("08","Assignment","Start new school project");
		TaskService.addTask("30", "Excercise", "Go to gym and run treadmill");
	}
 
	//We are testing to see if we can delete the assignment task for start school project
	@Test
	public void testDeleteTask() {
		new TaskService();
		TaskService.deleteTask("08", "Assignment","Start new school project");
	}

	//We are testing to see if we can update the exercise task and add a new task to the system
	@Test
	public void testUpdateTask() {
		new TaskService();
		TaskService.updateTask("30", "Excercise", "Go to gym and do stairmaster");
		
	
	}

}
