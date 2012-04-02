import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 *  Test class  for the Statistics class
@author Group12
@date 29/03/2012

 **/

public class StatisticsTest {
	
	private Statistics s1;

	
	/**
	 *  Setup method
	@author Group12
	@date 29/03/2012

	 **/
	@Before
	public void setUp() throws Exception {
		s1 = new Statistics();
		
	}

	/**
	 * method to test getCrashes method
	@author Group12
	@date 29/03/2012

	 **/
	@Test
	public void testGetCrashes() {
		assertEquals(s1.getCrashes(),0);
	}
	/**
	 * method to test getSuccessfullLanding method
	@author Group12
	@date 29/03/2012

	 **/
	@Test
	public void testGetSuccessfullLanding() {
		assertEquals(s1.getSuccessfullLanding(),0);
		}
	
	/**
	 * method to test getSuccessfullTakeOffs method
	@author Group12
	@date 29/03/2012

	 **/

	@Test
	public void testGetSuccessfullTakeOffs() {
		assertEquals(s1.getSuccessfullLanding(),0);
	}

	/**
	 * method to test incrementCrashes method
	@author Group12
	@date 29/03/2012

	 **/
	@Test
	public void testIncrementCrashes() {
		assertEquals(s1.incrementCrashes(),1);
	}

	/**
	 * method to test incrementSuccessfulLandings method
	@author Group12
	@date 29/03/2012

	 **/
	@Test
	public void testIncrementSuccessfulLandings() {
		assertEquals(s1.incrementSuccessfulLandings(),1);
	}

	/**
	 * method to test increment takeOffs method
	@author Group12
	@date 29/03/2012

	 **/
	@Test
	public void testIncrementTakeOffs() {
		assertequals(s1.incrementTakeOffs(),1);
		}

}
