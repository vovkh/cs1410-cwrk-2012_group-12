/**
 * @author Group 12
 *
 */
public class LightAircraft extends FuelledAircraft {

	protected static final int timeTakenToTakeOff = 120;
	protected static final  int timeTakenToLand = 180;
	protected static final int fuelRemaining_min = 10 * 60; // 10 mins * 60 seconds
	protected static final int fuelRemaining_max = 20 * 60; // 20 mins * 60 seconds
	protected Location location; 
	protected static final String aircraftType = "Light Aircraft"; 
	
	public LightAircraft(Airport airport) {
		super(airport, aircraftType, timeTakenToTakeOff, timeTakenToLand, fuelRemaining_min, fuelRemaining_max);
	}

	
}