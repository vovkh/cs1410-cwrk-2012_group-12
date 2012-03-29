
public abstract class Location {
	protected Queue aircraftInLocation; 
	
	
	public void add(Aircraft aircraft) {
		aircraftInLocation.addToQueue(aircraft);
	}
	
	public void remove(Aircraft aircraft) {
		aircraftInLocation.removeFromQueue(aircraft);
	}

	public String toString() {
		//Return details of all aircraft in location as a string
		return "";
	}
}
