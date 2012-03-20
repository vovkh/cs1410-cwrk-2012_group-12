
public class CommercialFlight extends Aircraft {

	public CommercialFlight (double probabilityOfArrival) 
	{
		super(probabilityOfArrival);
		
		// Number of seconds of fuel remaining = 20mins < x < 40mins
		// = 1200seconds < x < 2400seconds
		fuelRemaining = gen.nextInt(1200) + 1200;
		
		timeTakenToTakeOff = 2 * 60; // The number of seconds that at aircraft takes to depart // = 2mins;
		timeTakenToLand = 4 * 60; // The number of seconds that an aircraft takes to land // = 4mins;

	
	}
	

}
