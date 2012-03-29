
public class CommercialFlight extends FuelledAircraft {
	
	protected static final int timeTakenToTakeOff = 120;
	protected static final int timeTakenToLand = 180;
	protected static final int fuelRemaining_min = 1200; // 20 mins * 60
	protected static final int fuelRemaining_max = 2400; // 40 mins * 60
	protected Location location; 
	protected static final String aircraftType = "Commercial Flight"; 

	public CommercialFlight (Location location) {
		super(location, aircraftType, fuelRemaining_min, fuelRemaining_max, timeTakenToTakeOff, timeTakenToLand);
	}
	


}
