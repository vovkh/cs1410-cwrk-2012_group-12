import java.util.ArrayList;

public class Queue 
{
	private ArrayList<Aircraft> queue ;
	
	public void removeFromQueue(Aircraft aircraft) {
		queue.remove(aircraft);
	}
	
	public void addToQueue(Aircraft aircraft) {
		queue.add(aircraft);
	}
	
	
	public void swapAircraftInQueue() {
		
	}
}
