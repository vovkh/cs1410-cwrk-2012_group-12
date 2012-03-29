/**
 * @author Group 12
 *
 */
public class Runway extends Location {
	private Airport airport;
	private int runwayNumber;
	private boolean inUse;
	private Aircraft aircraftUsingRunway;
	
	private int timeInUse;

	public Runway(Airport airport, int runwayNumber) {
		this.airport = airport;
		this.runwayNumber = runwayNumber;
		
		//NB: Runway does not need to know what it is being used for, etc.. only needs to know that it is in use
		//   Aircraft classes will manage landing / departing / crashing etc etc etc (ie, moving to alternate location)....
		
		inUse = false; // default to the runway being available
		aircraftUsingRunway = null; // the aircraft using the runway, else null
		timeInUse = 0;
	}
	
	
	public void assignAircraftToRunway( Aircraft aircraft ) {
		if(!inUse) {
			//Mark runway as being in use
			inUse = true;
			
			//Add aircraft to runway
			aircraftUsingRunway = aircraft;
			
			//Initiate the landing/departing sequence of the aircraft about to land
			aircraftUsingRunway.act();
		}
		else {
			//Runway already in use
			
			//TODO: Throw runwayAlreadyInUse exception
		}
	}
	
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	
	public void incrementTimeInUse() {
		if( inUse ) {
			timeInUse++;
		}
	}
	
	public boolean isInUse() {
		//
		return inUse;
	}

}
