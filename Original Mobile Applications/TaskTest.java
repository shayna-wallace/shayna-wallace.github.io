import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class TaskTest {

	@Test
	public void testTask() {
		Task task = new Task("7077","Shopping","Go to mall to buy new shoes for marthon.");
		assertTrue(task.gettaskID().equals("7077"));
		assertTrue(task.getName().equals("Shopping"));
		assertTrue(task.getDescription().equals("Go to mall to buy new shoes for marthon."));

	}

	@Test
	 public void testTaskToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			 new Task("6890123670812", "Shopping", "Go to the mall to buy new shoes for marthon.");
			 });
		
	}
		
	}

	