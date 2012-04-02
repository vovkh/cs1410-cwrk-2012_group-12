import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 *  Test class  for Airspace class
@author Group12
@date 29/03/2012

 **/

public class AirspaceTest {

	private Airspace a1;
	
	/**
	 *  Setup Method
	@author Group12
	@date 29/03/2012

	 **/	
	@Before
	public void setUp() throws Exception {
		
		
	}

	
	/**
	 *  method to test getAircraftFuelLevel method
	@author Group12
	@date 29/03/2012

	 **/
	@Test
	public void testGetAircraftFuelLevel() {
		equals(a1.getAircraftFuelLevel());
		
	}

}
