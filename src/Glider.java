
public class Glider extends UnfuelledAircraft {	
	
	protected static final int timeTakenToTakeOff = 180;
	protected static final int timeTakenToLand = 240;
	protected Location location; 
	protected static final String aircraftType = "Glider"; 
	
<<<<<<< HEAD
<<<<<<< HEAD
	public Glider(Location location) {
		super(location, aircraftType, timeTakenToTakeOff, timeTakenToLand);
	}
	
	
	public void towDown(Queue queName, String aircraftType){
		queName.findAircraftTypeInQueueGround(aircraftType);
=======
=======
>>>>>>> ea00eaaea7dec2a58ebf41f8376ea982de6dd6bc
	public Glider(String aircraftName, double probabilityOfArrival) 
	{
		super(probabilityOfArrival);
	}
	
	
	public void towDown(Queue queName, Aircraft aircraftName){
		
<<<<<<< HEAD
>>>>>>> 6d818cad4423d5571519b9db7dbbbdd2077349fd
=======
=======
	public Glider(Location location) {
		super(location, aircraftType, timeTakenToTakeOff, timeTakenToLand);
	}
	
	
	public void towDown(Queue queName, String aircraftType){
		queName.findAircraftTypeInQueueGround(aircraftType);
>>>>>>> a41b7a19b9159c8e7496ef574229c651bf7fa685
>>>>>>> ea00eaaea7dec2a58ebf41f8376ea982de6dd6bc
	}
	
	public Queue getLightAircraftInQueue(){
		return null;
	}


}
