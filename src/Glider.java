
public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeTakenToTakeOff = 180;
	protected static final int timeTakenToLand = 240;
	protected Location location; 
	protected static final String aircraftType = "Glider"; 
	
<<<<<<< HEAD
	public Glider(String aircraftName, double probabilityOfArrival) 
	{
		super(probabilityOfArrival);
	}
	
	
	public void towDown(Queue queName, Aircraft aircraftName){
		
=======
	public Glider(Location location) {
		super(location, aircraftType, timeTakenToTakeOff, timeTakenToLand);
	}
	
	
	public void towDown(Queue queName, String aircraftType){
		queName.findAircraftTypeInQueueGround(aircraftType);
>>>>>>> a41b7a19b9159c8e7496ef574229c651bf7fa685
	}
	
	public Queue getLightAircraftInQueue(){
		return null;
	}


}
