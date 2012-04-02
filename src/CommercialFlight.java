/**
 * @author Group 12
 *
 */
public class CommercialFlight extends FuelledAircraft {
	
	protected static final int timeNeededToTakeOff = 120;
	protected static final int timeNeededToLand = 180;
	protected static final int fuelRemaining_min = 1200; // 20 mins * 60
	protected static final int fuelRemaining_max = 2400; // 40 mins * 60
	protected Location location; 
	protected static final String aircraftType = "Commercial Flight"; 

	public CommercialFlight (Airport airport) {
		super(airport, aircraftType, timeNeededToTakeOff, timeNeededToLand, fuelRemaining_min, fuelRemaining_max);
	}
	


}
