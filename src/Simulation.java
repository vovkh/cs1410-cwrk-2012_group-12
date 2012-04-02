import java.util.Random;
/**
 * @author Group 12
 *
 */
public class Simulation {
	private final static double COMMERCIAL_FLIGHT_PROBABILITY = 0.001; // the chance of creating a commercial flight -- to be changed later
    private final static double GLIDER_PROBABILITY = 0.002; // 0.2% chance of creating a glider
    private final static double LIGHT_AIRCRAFT_PROBABILITY = 0.005; // 0.5% chance of creating a light aircraft
    private final static int SEED = 42;
    
    private static int simulationLength = 24*60*60; // 24hours; 
    private static int tickSize = 30; // 30seconds;
    
    
 	/**
 	 * @param args
 	 */
 	public static void main(String[] args) {
 		//SIMULATION-RELATED VARIABLES
		Random rand = new Random(SEED);
		Timer timer = new Timer(null, simulationLength, tickSize);
		
 		
 		//CREATE THE AIRPORT AND THE LOCATIONS WITHIN IT
 		Airport airport = new Airport();
 		
 		
		while(!timer.isMaxSimulationTimeExceeded()) {
			timer.advanceByTick();
			
			//Generate new aircraft and add to simulation
			Aircraft newAircraft = generateAircraftBasedOnProbability(airport, rand.nextDouble());
			if(newAircraft != null) {
				addAircraftToSimulation(airport, newAircraft);
			}
			
			
			// QUEUEING -- CHOOSE AIRCRAFT AND INITIATE ACTION
			// NB: Should / could be abstracted out to a separate class as is a queuing responsibility, not a simulation responsibility? 
			/*
			
			Aircraft currentAircraft; // Choose which aircraft to be using this tick
			if( aircraft is on runway ) {
				currentAircraft = aircraft currently on runway;
			} 
			else if ( aircraft are waiting to land ) {
				//FIRST:: Check for aircraft waiting to land
				currentAircraft = first aircraft in the queue waiting to land
			}
			else if ( aircraft are waiting to depart ) {
				//SECOND:: Only when there are no aircraft waiting to land may an aircraft depart
				currentAircraft = first aircraft is the queue waiting to depart
			}
			else {
				// There are no aircraft waiting to land or depart
				// -> Do nothing
			}
		 	
		 	currentAircraft.act(); // The aircraft should know its own location/status, thus .act() automatically decides whether it will land/depart/crash etc (depending on its own current location)
			*/
			
		}
		
		
	}
	
	
	private static void addAircraftToSimulation(Airport airport, Aircraft aircraft) {
		
		Random rand = new Random(SEED);
		
		if(rand.nextBoolean()) { 
			//Add to airspace, waiting to land
			airport.addToArrivals(aircraft);
		}
		else {
			//Add to hangars, waiting to depart
			airport.addToDepartures(aircraft);
		}

	}
	
	private static Aircraft generateAircraftBasedOnProbability(Airport airport, double probability) {
		Aircraft newAircraft;
		
		if(probability <= ( COMMERCIAL_FLIGHT_PROBABILITY )) {
			newAircraft = new CommercialFlight(airport);
		}
	    else if(probability <= ( GLIDER_PROBABILITY + COMMERCIAL_FLIGHT_PROBABILITY )) {
	    	newAircraft = new Glider(airport);
		}
	    else if(probability <= ( LIGHT_AIRCRAFT_PROBABILITY + GLIDER_PROBABILITY + COMMERCIAL_FLIGHT_PROBABILITY )){
	    	newAircraft = new LightAircraft(airport);
		}
	    else {
	    	newAircraft = null;
	    }
		
		return newAircraft;
	}
	
}
