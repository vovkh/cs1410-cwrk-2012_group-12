import java.util.ArrayList;

/**
 * A queue for aircraft. Aircraft may be added / removed. Used by locations to track the aircraft inside that location.
 * @author Group 12
 * @date 29/Mar/2012
 */

public class Queue 
{
	protected ArrayList<Aircraft> queue;
	
	/**
	 * 
	 */
	public Queue(){
		queue = new ArrayList<Aircraft>();
		
    //test
	//	testAircraft = new Aircraft(null, null, 0, 0);
	//	addToQueueGround(testAircraft);
	//	addToQueueAir(testAircraft);
		
	}
	
	/**
	 * Remove an aircraft from the queue
	 * @param aircraft The aircraft to be removed
	 */
	public void removeFromQueue(Aircraft aircraft) {
		queue.remove(aircraft);
	}
	
	/**
	 * Get an Aircraft from the queue
	 * @param index
	 */
	public Aircraft getFromQueue(int index) {
		return queue.get(index);
	}
	
	/**
	 * Add an aircraft to the queue
	 * @param aircraft aircraft to be added
	 */
	public void addToQueue(Aircraft aircraft) {
		queue.add(aircraft);
	}
	
	
	/**
	 * Get the size of the queue
	 * @return the size of the queue
	 */
	public int size() {
		return queue.size();
	}
	
	/**
	 * Check to see if there is an aircraft of type aircraftType in the queue. 
	 * NB: Used by light aircraft / gliders to check if they can take off together
	 * 		(light aircraft tow gliders up)
	 * @param aircraftType	the name of the aircraft type that you are searching
	 * @return boolean
	 */
	public boolean isAircraftTypeInQueue(String aircraftType){
		for(int i=0; i<queue.size(); i++) {
			if(queue.get(i).getAircraftType() == aircraftType) {
				return true;
			}
		}
		return false;
	}

}
