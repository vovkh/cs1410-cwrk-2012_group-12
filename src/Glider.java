/**
 * @author Group 12
 *
 */
public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeTakenToTakeOff = 180;
	protected static final int timeTakenToLand = 240;
	protected Location location; 
	protected static final String aircraftType = "Glider"; 

	public Glider(Airport airport) {
		super(airport, aircraftType, timeTakenToTakeOff, timeTakenToLand);
	}
	
	
	
	private void takeOff(){
		//
	}

	public Queue getLightAircraftInQueue() {
		return null;
	}


}
