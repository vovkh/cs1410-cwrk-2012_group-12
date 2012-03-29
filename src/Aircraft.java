/**
 * @author Group 12
 *
 */
public abstract class Aircraft {
	protected String aircraftType;
	protected int aircraftId;
	protected Airport currentAirport;
	protected Location location;
	protected int timeTakenToLand;
	protected int timeTakenToTakeOff;

	
	public Aircraft (Airport airport, String aircraftType, int timeTakenToTakeOff, int timeTakenToLand) {
		this.currentAirport = airport;
		this.timeTakenToLand = timeTakenToLand;
		this.timeTakenToTakeOff = timeTakenToTakeOff;
		this.aircraftType = aircraftType;	
		
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String getAircraftType() {	
		return aircraftType;
	}
	
	public int getTimeTakenToLand() {
		return timeTakenToLand;
	}
	
	public int getTimeTakenToTakeOff() {
		return timeTakenToTakeOff;
	}
	
	
	public void act() {
		int availableRunwayNumber = this.currentAirport.getAvailableRunwayNumber(); 

		if(this.location instanceof Hangar) {
			//Is currently in the airport hangar, waiting to take off			
			if(availableRunwayNumber != -1) {
				takeOff(availableRunwayNumber);
			}
			else {
				//No runway available, do nothing
			}
		}
		else if(this.location instanceof Airspace) {
			//Is currently in the airport airspace, waiting to land
			if(availableRunwayNumber != -1) {
				land(availableRunwayNumber);
			}
			else {
				//No runway available, do nothing
			}
		}
		else if(this.location instanceof Workshop) {
			//Is currently in the airport workshop, waiting to be repaired
			
			//TODO:
			// if(aircraft has been in the workshop long enough | has been repaired) {
			// 		return aircraft to hangars
			// } 
			// else {
			// 		do nothing
			// }
		}
		else {
			//Unknown location
		}
	}
	
	
	private void takeOff( int runwayNumber ) {
		//Assign this aircraft to the given runway number		
		this.currentAirport.assignAircraftToRunway(runwayNumber, this);
		
		//Remove from hangar
		this.currentAirport.removeFromHangars(this);
		
	}
	
	private void land( int runwayNumber ) {
		//
	}
	
}
