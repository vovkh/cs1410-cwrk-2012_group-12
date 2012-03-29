/**
 * @author Group 12
 *
 */
public abstract class FuelledAircraft extends Aircraft{
	protected int fuelRemaining_min;
	protected int fuelRemaining_max;

	public FuelledAircraft(Airport airport, String aircraftType, int fuelRemaining_min,  int fuelRemaining_max, int timeTakenToTakeOff, int timeTakenToLand) {
		super(airport, aircraftType , timeTakenToTakeOff, timeTakenToLand);
		this.fuelRemaining_min = fuelRemaining_min;
		this.fuelRemaining_max = fuelRemaining_max;
	}

	public int getFuelRemainingMin(){
		return fuelRemaining_min;
	}
	
	public int getFuelRemainingMax(){
		return fuelRemaining_max;
	}
	
}
