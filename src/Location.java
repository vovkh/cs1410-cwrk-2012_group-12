/**
 * @author Group 12
 *
 */
public abstract class Location {
	protected Queue aircraftInLocation; 
	
	
	public void add(Aircraft aircraft) {
		aircraftInLocation.addToQueue(aircraft);
	}
	
	public void remove(Aircraft aircraft) {
		aircraftInLocation.removeFromQueue(aircraft);
	}
	
	public Aircraft get(int index) {
		return aircraftInLocation.getFromQueue(index);
	}

	public int size() {
		return aircraftInLocation.size();
	}
	
	public String toString() {
		//Return details of all aircraft in location as a string
		return "";
	}
}
