
/**

 * Class to keep track of airport statistics such as crashes, 
 * landings , take offs and number of aircraft generated.
@author Group12
@date 29/03/2012

 **/

public class Statistics {
	private int crash;

	private int successfullLandings;

	private int successfullTakeOffs;

	public Statistics(){
		crash = 0;
		successfullLandings = 0;
		successfullTakeOffs = 0;
	}

	/**
	 * method to return number of crashes
	 * @author   group 12
	 * @date  30/03/2012
	 **/
	public int getCrashes(){
		return crash;
	} 

	/**
	 * method to return number of successful landings
	 * @author   group 12
	 * @date  30/03/2012
	 **/
	public int getSuccessfullLanding(){
		return successfullLandings;
	} 

	/**
	 * method to return number of successful take offs
	 * @author   group 12
	 * @date  30/03/2012
	 **/
	public int getSuccessfullTakeOffs(){
		return successfullTakeOffs;
	} 

	/**
	 * method to increase the number of crashes by one
	 * @author   group 12
	 * @date  30/03/2012
	 **/
	public void incrementCrashes(){
		crash ++;
	} 


	/**
	 * method to increase the number of successful landings by one
	 * @author   group 12
	 * @date  30/03/2012
	 **/

	public void incrementSuccessfulLandings(){
		successfullLandings ++;
	}


	/**
	 * method to increase the number of take offs by one
	 * @author   group 12
	 * @date  30/03/2012
	 **/

	public void incrementTakeOffs(){
		successfullTakeOffs ++;
	} 

}
