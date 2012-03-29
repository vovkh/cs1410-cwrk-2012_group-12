import java.util.ArrayList;

public class Queue 
{
	protected ArrayList<Aircraft> queueGround;
	protected ArrayList<Aircraft> queueAir;
	//private Aircraft testAircraft;
	
	public Queue(){
		queueGround = new ArrayList<Aircraft>();
		queueAir = new ArrayList<Aircraft>();
		
    //test
	//	testAircraft = new Aircraft(null, null, 0, 0);
	//	addToQueueGround(testAircraft);
	//	addToQueueAir(testAircraft);
		
	}
	public void removeFromQueueGround(Aircraft aircraft) {
		queueGround.remove(aircraft);
	}
	
	public void addToQueueGround(Aircraft aircraft) {
		queueGround.add(aircraft);
	}
	
	public void removeFromQueueAir(Aircraft aircraft) {
		queueAir.remove(aircraft);
	}
	
	public void addToQueueAir(Aircraft aircraft) {
		queueAir.add(aircraft);
	}
	
	public void swapAircraftInQueue() {
	}
	
	public int getQueueGroundSize() {
		return queueGround.size();
	}
	public int getQueueAirSize() {
		return queueAir.size();
	}
	public boolean findAircraftTypeInQueueGround(String aircraftType){
		//if(queueGround.contains())...
		return false;
		
	}

}
