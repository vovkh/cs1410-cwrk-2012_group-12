import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class QueueTest {
	
	private ArrayList<Aircraft> q1;
	private Aircraft a1;
	private Aircraft a2;

	@Before
	public void setUp() throws Exception {
		q1 = new ArrayList<Aircraft>();	
		q1.add(a1);
	}

	@Test
	public void testRemoveFromQueue() {
		equals(q1.remove(a1));	
}

	@Test
	public void testGetFromQueue() {
		equals(q1.get(0));
	}

	@Test
	public void testAddToQueue() {
		equals(q1.add(a2));
	}

	@Test
	public void testSize() {
		assertEquals(q1.size(),1);
	}

	@Test
	public void testIsAircraftTypeInQueue() {
		fail("Not yet implemented");
	}

}
