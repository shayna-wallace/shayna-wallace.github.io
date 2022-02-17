/**
 * This program was created for a mobile application and to test the requirements for the 
 * to make sure all the requirements have been meet and passes.
 * This class houses the JUnit tests for the tasks. These test ensure that the tasks requirements
 * are being meet. That they meet the length requirement and no field is left blank/null.
**/

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

//A set of JUnit tests to test the task requirements

public class TaskTest {

	@Test
	public void testTask() {
		Task task = new Task("7077","Shopping","Go to mall to buy new shoes for marthon.");
		assertTrue(task.gettaskID().equals("7077"));
		assertTrue(task.getName().equals("Shopping"));
		assertTrue(task.getDescription().equals("Go to mall to buy new shoes for marthon."));

	}
	
	//ADDED - Testing to see if the TaskID is too long and if an exception will be throw
	@Test
	public void testTaskIDTooLong() {
		Task task = new Task("478278901212","School work","Start working on capstone artifact");
		    assertTrue(task.gettaskID().length() > 10);
	}
	
	//ADDED - Testing to see if the taskName is too long and if so an exception should be throw
	//and display a message
	@Test
	public void testTaskNameTooLong() {
		Task task = new Task("90","Create Blog on Social Media Money Makers", "Provides ways to make money fast");
		assertTrue(task.getName().length() > 10);
	}

	@Test
	 public void testTaskTwo() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new Task("6890123670812", "Shopping", "Go to the mall to buy new shoes for marthon.");
		});
	}
		
		
}

	
