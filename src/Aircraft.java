
public abstract class Aircraft {
	protected String aircraftType;
	protected int aircraftId;
	protected Location currentLocation;
	protected int timeTakenToLand;
	protected int timeTakenToTakeOff;
	protected Queue qu;

	
	public Aircraft (Location location, String aircraftType, int timeTakenToTakeOff, int timeTakenToLand) {
		this.currentLocation = location;
		this.timeTakenToLand = timeTakenToLand;
		this.timeTakenToTakeOff = timeTakenToTakeOff;
		this.aircraftType = aircraftType;	
		
	}
	public void changeAircraftLocation(Location location) {	
		this.currentLocation = location;
	}
	
	public String getAircraftType() {	
		return aircraftType;
	}
	
	public int getTimeTakenToLand(){
		return timeTakenToLand;
	}
	
	public int getTimeTakenToTakeOff(){
		return timeTakenToTakeOff;
	}
	
	public void takeOff(Queue queName) {
		if(queName.getQueueGroundSize()!=0){
			queName.removeFromQueueGround(this);
			System.out.println(getAircraftType()+" has Taken off");
		}
	}
	
	public void land(Queue queName) {
		if(queName.getQueueAirSize()!=0){
			queName.removeFromQueueAir(this);
			System.out.println(getAircraftType()+" has landed");
		}
		
		
	}
	
}
