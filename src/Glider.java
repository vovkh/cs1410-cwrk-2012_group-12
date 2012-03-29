/**
 * @author Group 12
 *
 */
public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeTakenToTakeOff = 3 * 60; //3 minutes
	protected static final int timeTakenToLand = 4 * 60; //4 minutes
	protected Location location; 
	protected static final String aircraftType = "Glider"; 

	public Glider(Airport airport) {
		super(airport, aircraftType, timeTakenToTakeOff, timeTakenToLand);
	}
	
	
	
	private void takeOff(){
		//Must take off whilst being towed by 
	}

	public Queue getLightAircraftInQueue() {
		return null;
	}


}
