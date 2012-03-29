import java.util.ArrayList;

/**
 * @author Group 12
 *
 */
public class Airport {
	
	private int numberOfRunways;
	private Runway[] runways;
	
	private Hangar[] hangars;
	private Airspace[] airspace;
	private Workshop[] workshops;
	
	private Queue arrivalsQueue;
	private Queue departuresQueue;
	
	private int numberOfDepartures;
	private int numberOfArrivals;
	private int numberOfCrashes;
	private int totalWaitingTime;
	
	
	private int airportCapacity; //Maximum number of aircraft in hangars?
	private boolean needExpanding;
	
	/**
	 * Create an instance of the airport, with only a single runway
	 */
	public Airport () { 
		//Create an airport with only a single runway if a desired number of runways has been supplied
		createAirport(1); 
	}
	
	/**
	 * Create an instance of the airport, but with multiple runways.
	 * @param numberOfRunways the number of runways that the airport should have
	 */
	public Airport (int numberOfRunways) { 
		//Create an airport with the given number of runways requested
		createAirport(numberOfRunways); 
	}
	
	
	
	/**
	 * Method used to actually create the runway. 
	 * @param numberOfRunways the number of runways that the airport should have
	 */
	public void createAirport (int numberOfRunways) {
		//Initialise to sane values
		this.numberOfCrashes = 0;
		this.totalWaitingTime = 0;
		
		
		//Generate the runways at the current airport
		this.numberOfRunways = numberOfRunways;
		this.runways = new Runway[this.numberOfRunways];
		for( int i=0; i<this.numberOfRunways; i++ ) {
			this.runways[i] = new Runway(this, i);
		}
		
		
		//Create a location for the aircraft currently in the airport to stay
		hangars = new Hangar[1]; // Stick to single hangar
		hangars[1] = new Hangar();
		
		//Create a location for the aircraft being repaired to stay
		workshops = new Workshop[1]; // Single workshop
		workshops[1] = new Workshop();
		
		//Create a location for the aircraft currently in the airspace around the airport to stay
		airspace = new Airspace[1]; // Single set of airspace
		airspace[1] = new Airspace();
		
	}
	
	
	
	/**
	 * Get the first available runway number, else -1 if none available.
	 * TODO: Throw a caught exception instead of returning -1.
	 * @return the first available runway number. If no runways available, will return -1.
	 */
	public int getAvailableRunwayNumber () {
		//Return available runway number
		for(int i=0; i<runways.length; i++) {
			if( runways[i].isInUse() == false ) {
				return i;
			}
		}
		
		//If no runways currently available, return -1
		return -1;
	}
	
	
	/**
	 * @param runwayNumber
	 * @param aircraft
	 */
	public void assignAircraftToRunway( int runwayNumber, Aircraft aircraft ) {
		runways[runwayNumber].add(aircraft);
		runways[runwayNumber].setInUse(true);
	}

	/**
	 * Get the first available hangar. NB: More useful when using multiple hangars.
	 * @return the first Hangar object
	 */
	public Hangar getAvailableHangar() {
		//NM: Only using single hangar currently
		return hangars[0];
	}

	/**
	 * Remove the given aircraft from all hangars. 
	 * NB: Crude implementation, could check first to see if in hangar to see if the aircraft is in there before attempting to remove. 
	 * @param aircraft the aircraft to be removed
	 */
	public void removeFromHangars(Aircraft aircraft) {
		for(int i=0; i<hangars.length; i++ ) {
			hangars[i].remove(aircraft);
		}
	}
	
	/**
	 * Remove the given aircraft from all airspace. 
	 * NB: Crude implementation, could check first to see if in airspace to see if the aircraft is in there before attempting to remove. 
	 * @param aircraft the aircraft to be removed
	 */
	public void removeFromAirspace(Aircraft aircraft) {
		for(int i=0; i<airspace.length; i++ ) {
			airspace[i].remove(aircraft);
		}
	}
	
	/**
	 * Get the first available airspace. NB More useful when using multiple airspace areas.
	 * @return the first Airspace object.
	 */
	public Airspace getAvailableAirspace() {
		//NB: Only using single airspace currently
		return airspace[0];
	}
	
	/**
	 * Get the number of runways in this airport instance.
	 * @return the number of runways in this airport instance.
	 */
	public int getNumberOfRunways() {
		return numberOfRunways;
	}
	
	/**
	 * @param runwayNumber
	 * @return
	 */
	public Runway getRunwayNumber(int runwayNumber) {
		return runways[runwayNumber];
	}
	

	/**
	 * Loop through planes in hangars and add aircraft to the departure queue
	 * Done on every 'tick' after aircraft have been marked as landed / departed
	 * 
	 * This departure queue can then be used to fetch the highest priority aircraft for departure (first in, first out) 
	 */
	public void populateDepartureQueue() {
		for(int i=0; i<hangars.length; i++) {
			//For every hangar
			for(int j=0; j < hangars[i].size(); j++) {
				//.. and every aircraft inside each hangar
				//Add it to the departures queue
				departuresQueue.addToQueue(hangars[i].get(j));
			}
		}
	}
	
	/**
	 * Loop through aircraft in the airspace and add to the arrivals queue
	 * Done on every 'tick' after aircraft have been marked as landed / depart
	 * 
	 * This arrivals queue can then be used to fetch the highest priority aircraft for landing (first in, first down)
	 */
	public void populateArrivalsQueue() {
		for(int i=0; i<airspace.length; i++) {
			//For every airspace
			for(int j=0; j < airspace[i].size(); j++) {
				//.. and every aircraft inside each airspace
				//Add it to the arrivals queue
				arrivalsQueue.addToQueue(airspace[i].get(j));
			}
		}
	}
	
	
	/**
	 * Keep track of how many crashes have happened at this airport.
	 */
	public void incrementCrashTotal() {
		numberOfCrashes++;
	}

	/**
	 * Add an aircraft to the departures queue. 
	 * Currently the departures queue is held as "Hangar"s, and this method will automatically choose which hangar to assign the aircraft to. 
	 * @param aircraft the aircraft to add to the departures.
	 */
	public void addToDepartures(Aircraft aircraft) {
		getAvailableHangar().add(aircraft);
	}
	
	/**
	 * Add an aircraft to the departures queue. 
	 * Currently the arrivals queue is held as "Airspace"s, and this method will automatically choose which airspace to assign the aircraft to. 
	 * @param aircraft the aircraft to add to the arrivals.
	 */
	public void addToArrivals(Aircraft aircraft) {
		getAvailableAirspace().add(aircraft);
	}
	
	/**
	 * Keep track of how long the aircraft in the airport have been waiting to land and depart.
	 */
	public void incrementTotalWaitingTime() {
		//Calculate number of aircraft in air/in hangars waiting to land/depart
		//Multiply the number of aircraft calculated above by the 'tick' length and add it to the current totalWaitingTime
	}
	
	/**
	 * 
	 */
	public void printSummary() {
		
	}

}
