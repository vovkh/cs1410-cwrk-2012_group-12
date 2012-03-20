import java.util.Random;


public abstract class Aircraft {
	protected String aircraftId;
	protected double probabilityOfArrival;
	
	protected Location currentLocation;
	protected int totalWaitingTime;
	
	protected int timeToCompleteDeparture;
	protected int timeToCompleteLanding;
	protected int timeToCompleteRepairs;
	
	
	protected int timeTakenToTakeOff;
	protected int timeTakenToLand;
	protected double departedTime;
	protected double arrivedTime;
	protected int fuelRemaining;
	protected int fuelConsumptionByStep;
	
	protected Random gen = new Random(42); // Or choose a different seed
	
	protected Aircraft (double probabilityOfArrival, int fuelRemaining_min, int fuelRemaining_max, Location location) {
		this.probabilityOfArrival = probabilityOfArrival;
		this.currentLocation = location;
		this.fuelRemaining = generateSecondsOfFuelRemaining(fuelRemaining_min, fuelRemaining_max);
	}
	
	protected Aircraft (double probabilityOfArrival) {
		//Aircraft(String aircraftName, double probabilityOfArrival, runway1);
	}
	
	
	public void depart () {
		// If current location is a hangar
		// and is head of the queue to depart,
		// assign to runway and set the timeToCompleteDeparture
		
		//TODO:: What happens if tell aircraft to depart whilst in process of departing??
	}
	
	public void land () {
		// If current location is in the air
		// and is head of the queue to land,
		// assign to runway and set the timeToCompleteLanding
	}
	
	public void crash () {
		// If currently departing
		// randomly crash
		
		// Remove from departure queue
	}
	
	public void setLocation (Location location) {
		this.currentLocation = location;
	}
	
	
	
	/////
	/// Should be generate number of 'ticks' of fuel remaining????
	/////
	protected int generateSecondsOfFuelRemaining(int min_inclusive, int max_exclusive) {
		int numSecondsRemaining = gen.nextInt(min_inclusive) + (max_exclusive - min_inclusive);
		//NB: min_inclusive <= numSecondsRemaining < max_exclusive
		// Due to Random.nextInt(int) returning 0 <= x < int
		
		return numSecondsRemaining;
	}
	
	
	public void increaseWaitingTime(int x) {	
	}
	
	public void printAircraftStatus() {	
	}
	
	public void isWaitingToLand() {
		
	}


}
