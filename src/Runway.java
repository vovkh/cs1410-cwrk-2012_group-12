
public class Runway extends Location {
	private int runwayNumber;
	private boolean isAvailable;
	private Aircraft aircraftUsingRunway;
	
	private int timeInUse;

	public Runway(int runwayNumber) {
		this.runwayNumber = runwayNumber;
		
		//NB: Runway does not need to know what it is being used for, etc.. only needs to know that it is in use
		//   Aircraft classes will manage landing / departing / crashing etc etc etc (ie, moving to alternate location)....
		
		isAvailable = true; // default to the runway being available
		aircraftUsingRunway = null; // the aircraft using the runway, else null
		timeInUse = 0;
	}
	
	
	public void assignAircraftToRunway( Aircraft aircraft ) {
		if(!isAvailable) {
			//Mark runway as being in use
			isAvailable = false;
			
			//Add aircraft to runway
			aircraftUsingRunway = aircraft;
			
			//Initiate the landing/departing sequence of the aircraft about to land
			//aircraftUsingRunway.act();
		}
		
		
	}
	
	public void incrementTimeInUse() {
		if( !isAvailable ) {
			timeInUse++;
		}
	}
	
	public boolean isAvailable() {
		//
		return isAvailable;
	}

}
