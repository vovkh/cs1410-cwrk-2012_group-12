import java.util.Random;
/**
 * @author Group 12
 *
 */
public class Simulation {
	private static Queue queue;
	private final static double COMMERCIAL_FLIGHT_PROBABILITY = 0.001; // will change later
    private final static double GLIDER_PROBABILITY = 0.002;
    private final static double LIGHT_AIRCRAFT_PROBABILITY = 0.005;
    private final static int SEED = 42;
    
 	public static void main(String[] args){
	    
		Random rand = new Random(SEED);
		queue = new Queue();
		
		
		Aircraft newAircraft = generateAircraftBasedOnProbability(rand.nextDouble());
		if(newAircraft != null) {
			addAircraftToSimulation(newAircraft);
		}
	}
	public Simulation(){
		
	}
	
	
	private static void addAircraftToSimulation(Aircraft aircraft) {

	}
	
	private static Aircraft generateAircraftBasedOnProbability(double probability) {
		Aircraft newAircraft;
		
		Location locationToAddAircraft;
		
		Random rand = new Random(SEED);
		
		if(rand.nextDouble() <= 0.5) {
			//Add to departures
//			locationToAddAircraft = 
		}
		else {
			//Add to arrivals
		}
		
		
		if(probability <= ( COMMERCIAL_FLIGHT_PROBABILITY )) {
			newAircraft = new CommercialFlight(null);
		}
	    else if(probability <= ( GLIDER_PROBABILITY + COMMERCIAL_FLIGHT_PROBABILITY )) {
	    	newAircraft = new Glider(null);
		}
	    else if(probability <= ( LIGHT_AIRCRAFT_PROBABILITY + GLIDER_PROBABILITY + COMMERCIAL_FLIGHT_PROBABILITY )){
	    	newAircraft = new LightAircraft(null);
		}
	    else {
	    	newAircraft = null;
	    }
		
		return newAircraft;
	}
	
}
