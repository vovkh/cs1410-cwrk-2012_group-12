import java.util.ArrayList;
public class Airport {
	
	private int numberOfRunways;
	private Runway[] runways;
	
	private Hangar[] hangars;
	private Airspace[] airspace;
	private Workshop[] workshops;
	
	private Queue departureQueue;
	private Queue arrivalsQueue;
	
	private int numberOfCrashes;
	private int totalWaitingTime; // What is meant by "waiting time"??
	
	
	private int airportCapacity; //Maximum number of aircraft in hangars?
	private boolean needExpanding;
	
	public Airport () { 
		//Create an airport with only a single runway if a desired number of runways has been supplied
		createAirport(1); 
	}
	
	public Airport (int numberOfRunways) { 
		//Create an airport with the given number of runways requested
		createAirport(numberOfRunways); 
	}
	
	
	
	public void createAirport (int numberOfRunways) {
		//Initialise to sane values
		this.numberOfCrashes = 0;
		this.totalWaitingTime = 0;
		
		
		//Generate the runways at the current airport
		this.numberOfRunways = numberOfRunways;
		this.runways = new Runway[this.numberOfRunways];
		for( int i=0; i<this.numberOfRunways; i++ ) {
			this.runways[i] = new Runway(i);
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
	
	
	
	public int getFirstAvailableRunwayNumber () {
		//Return available runway number
		
		//If no runways currently available, return -1
		return -1;
	}
	
	
	public void assignAircraftToRunway( int runwayNumber, Aircraft aircraft ) {
		runways[runwayNumber].add(aircraft);
	}
	
	
	public int getNumberOfRunways() {
		return numberOfRunways;
	}
	
	public Runway getRunwayNumber(int runwayNumber) {
		return runways[runwayNumber];
	}
	
	
	public void populateDepartureQueue() {
		//Loop through planes in hangars and add aircraft to the departure queue
		//Done on every 'tick' after aircraft have been marked as landed / departed
	}
	
	public void populateArrivalsQueue() {
		//Loop through aircraft in the airspace and add to the arrivals queue
		//Done on every 'tick' after aircraft have been marked as landed / depart
	}
	
	
	public void incrementCrashTotal() {
		numberOfCrashes++;
	}
	
	
	
	public void incrementTotalWaitingTime() {
		//Calculate number of aircraft in air/in hangars waiting to land/depart
		//Multiply the number of aircraft calculated above by the 'tick' length and add it to the current totalWaitingTime
	}
	
	public void printSummary() {
		
	}

}
