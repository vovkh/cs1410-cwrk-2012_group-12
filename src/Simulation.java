import java.util.Random;

public class Simulation {
	private static Queue q;
	private final static double COMMERCIAL_FLIGHT_PROBABILITY = 0.001; // will change later
    private final static double GLIDER_PROBABILITY = 0.002;
    private final static double LIGHT_AIRCRAFT_PROBABILITY = 0.005;
    
 	public static void main(String[] args){
		int seed = 42; 
	    
		Random rand = new Random(seed);
		Random rand2 = new Random(seed);
		q = new Queue();
		if(rand.nextDouble() <= COMMERCIAL_FLIGHT_PROBABILITY) {
			Aircraft cF = new CommercialFlight(null);
			if(rand2.nextDouble() <= 0.5){ // 50/50 chance of it either being on the Ground queue or Air queue
				q.addToQueueAir(cF);
			}
			else{
				q.addToQueueGround(cF);
			}
		}
	    else if(rand.nextDouble() <= GLIDER_PROBABILITY){
	    	Aircraft g = new Glider(null);
	    	if(rand2.nextDouble() <= 0.5){
				q.addToQueueAir(g);
			}
			else{
				q.addToQueueGround(g);
			}
		}
	    else if(rand.nextDouble() <= LIGHT_AIRCRAFT_PROBABILITY){
	    	Aircraft lA = new LightAircraft(null);
	    	if(rand2.nextDouble() <= 0.5){
				q.addToQueueAir(lA);
			}
			else{
				q.addToQueueGround(lA);
			}
		}
	////////////////////////////////////////////////////////////////////////////////////////////////	
	//test 0
		System.out.println("Test 0");
		Aircraft g2 = new Glider(null);
		System.out.println("Time it takes glider to land (seconds) = "+g2.getTimeTakenToLand());
		System.out.println("Time it takes glider to take off (seconds) = "+g2.getTimeTakenToTakeOff());
		
		
	//test 1
		System.out.println("Test 1");
		if(q.getQueueGroundSize()==0){
			System.out.println("its zero");
		}
		else{
			System.out.println("not zero");
		}
	//test 2 - Landing 
		System.out.println("Test 2");
		Aircraft lA2 = new LightAircraft(null);
		System.out.println("Queue Air Size is "+q.getQueueAirSize());
		q.addToQueueAir(lA2); // adding to Queue
		System.out.println("Now Queue Air Size is "+q.getQueueAirSize());
		lA2.land(q);
		System.out.println("Now Queue Air Size is "+q.getQueueAirSize());
		
	//test 3 - Taking off
		System.out.println("Test 3");
		Aircraft cF2 = new CommercialFlight(null);
		System.out.println("Queue Ground Size is "+q.getQueueGroundSize());
		q.addToQueueGround(cF2);
		System.out.println("Now Queue Ground Size is "+q.getQueueGroundSize());
		cF2.takeOff(q);
		System.out.println("Now Queue Ground Size is "+q.getQueueGroundSize());
	///////////////////////////////////////////////////////////////////////////////////////////////////	
	}
	public Simulation(){
		
	}
	
}
