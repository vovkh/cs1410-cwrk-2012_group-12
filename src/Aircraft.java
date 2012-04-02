/**
 * @author Group 12
 *
 */
public abstract class Aircraft {
	protected String aircraftType;
	protected int aircraftId;
	protected Airport currentAirport;
	protected Location location;
	protected int timeNeededToLand;
	protected int timeNeededToTakeOff;

	/**
	 * @param airport
	 * @param aircraftType
	 * @param timeNeededToTakeOff
	 * @param timeNeededToLand
	 */
	public Aircraft(Airport airport, String aircraftType, int timeNeededToTakeOff, int timeNeededToLand) {
		this.currentAirport = airport;
		this.timeNeededToLand = timeNeededToLand;
		this.timeNeededToTakeOff = timeNeededToTakeOff;
		this.aircraftType = aircraftType;

	}

	/**
	 * @param location the location to move the aircraft to
	 */
	private void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the aircraft type (string)
	 */
	public String getAircraftType() {
		return this.aircraftType;
	}

	/** 
	 * @return the amount of time (seconds) needed for this aircraft to land
	 */
	private int gettimeNeededToLand() {
		return this.timeNeededToLand;
	}

	/**
	 * @return the amount of time (seconds) needed for this aircraft to take off
	 */
	private int getTimeNeededToTakeOff() {
		return this.timeNeededToTakeOff;
	}

	/**
	 * The aircraft should know its own location/status, thus .act()
	 * automatically decides whether it will land/depart/crash etc (depending on
	 * its own current location).
	 * 
	 */
	public void act() {
		int availableRunwayNumber = this.currentAirport
				.getAvailableRunwayNumber();

		if (this.location instanceof Hangar) {
			// Is currently in the airport hangar, waiting to take off
			if (availableRunwayNumber != -1) {
				takeOff(availableRunwayNumber);
			} else {
				// No runway available, do nothing
			}
		} else if (this.location instanceof Airspace) {
			// Is currently in the airport airspace, waiting to land
			if (availableRunwayNumber != -1) {
				land(availableRunwayNumber);
			} else {
				// No runway available, do nothing
			}
		} else if (this.location instanceof Workshop) {
			// Is currently in the airport workshop, waiting to be repaired

			// TODO:
			// if(aircraft has been in the workshop long enough | has been
			// repaired) {
			// 		return aircraft to hangars
			// }
			// else {
			// 		do nothing
			// }
		} else {
			// Unknown location
		}
	}

	/**
	 * @param runwayNumber the runway number to be used
	 */
	private void takeOff(int runwayNumber) {
		// Assign this aircraft to the given runway number
		this.currentAirport.assignAircraftToRunway(runwayNumber, this);

		// Remove from hangar
		this.currentAirport.removeFromHangars(this);

	}

	/**
	 * @param runwayNumber the runway number to be used
	 */
	private void land(int runwayNumber) {
		//
	}

	/**
	 * @return Returns a description of the current aircraft
	 */
	@Override
	public String toString() {
		return "";
	}
}
