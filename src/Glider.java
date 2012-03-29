
public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeTakenToTakeOff = 180;
	protected static final int timeTakenToLand = 240;
	protected Location location; 
	protected static final String aircraftType = "Glider"; 
	
<<<<<<< HEAD
	public Glider(Location location) {
		super(location, aircraftType, timeTakenToTakeOff, timeTakenToLand);
	}
	
	
	public void towDown(Queue queName, String aircraftType){
		queName.findAircraftTypeInQueueGround(aircraftType);
=======
	public Glider(String aircraftName, double probabilityOfArrival) 
	{
		super(probabilityOfArrival);
	}
	
	
	public void towDown(Queue queName, Aircraft aircraftName){
		
>>>>>>> 6d818cad4423d5571519b9db7dbbbdd2077349fd
	}
	
	public Queue getLightAircraftInQueue(){
		return null;
	}


}
