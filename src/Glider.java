public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeTakenToTakeOff = 180;
	protected static final int timeTakenToLand = 240;
	protected Location location; 
	protected static final String aircraftType = "Glider"; 

	public Glider(Location location) {
		super(location, aircraftType , timeTakenToTakeOff, timeTakenToLand);
	}
	
	public void towDown(Queue queName, String aircraftType){
		queName.findAircraftTypeInQueueGround(aircraftType);
	}

	public Queue getLightAircraftInQueue() {
		return null;
	}


}
