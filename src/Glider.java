
public class Glider extends Aircraft {	
	
//	private static final double  probabilityOfArrival = 0.002;
	private static final int timeTakenToTakeOff = 120;
	private static final int ltimeTakenToLand = 240;
	
	public Glider(String aircraftName, double probabilityOfArrival) 
	{
		super(probabilityOfArrival);
	}
	
	
	public void towDown(Queue queName, Aircraft aircraftName){
		
	}
	
	public Queue getLightAircraftInQueue(){
		return null;
	}


}
