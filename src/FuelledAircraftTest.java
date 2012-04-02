import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FuelledAircraftTest {

	private integer min;
	private integer max;
	
	
	/**
	 * Setup method
	@author Group12
	@date 29/03/2012

	 **/
	@Before
	public void setUp() throws Exception {
		min = 10;
		max= 100;
		
	}
	
	/**
	 * method to test getFuelRemainingMin method
	@author Group12
	@date 29/03/2012

	 **/

	@Test
	public void testGetFuelRemainingMin() {
		assertEquals(min.getFuelRemainingMin(),10);
	}
	
	/**
	 * method to test getFuelRemainingMax method
	@author Group12
	@date 29/03/2012

	 **/

	@Test
	public void testGetFuelRemainingMax() {
		assertEquals(max.getFuelRemainingMax(),100);
	}

}
