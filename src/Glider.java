/**
 * @author Group 12
 *
 */
public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeNeededToTakeOff = 3 * 60; //3 minutes
	protected static final int timeNeededToLand = 4 * 60; //4 minutes
	protected Location location; 
	protected static final String aircraftType = "Glider"; 

	public Glider(Airport airport) {
		super(airport, aircraftType, timeNeededToTakeOff, timeNeededToLand);
	}
	
	
	
	private void takeOff(){
		//Must take off whilst being towed by a light aircraft
	}

	public Queue getLightAircraftInQueue() {
		return null;
	}


}
