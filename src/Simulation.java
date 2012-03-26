
public class Simulation {
	private int lengthOfSimulation;
	private int lengthOfTick;
	private double currentTime;
	private Airport airport;
	private boolean simulationActive;

	public Simulation() {
		lengthOfSimulation = 24 * 60 * 60; // 24hours * 60mins * 60secs = 86400 seconds
		lengthOfTick = 30; // 30-seconds

		//Begin at time 0
		currentTime = 0;
		simulationActive = false;

		//Create new airport with a single (1) runway
		Airport airport = new Airport(1);

		//Create the airspace 

		//Probabilities of each aircraft type arriving ::
		double probabilityOfCommercialFlight = 0.005;
		double probabilityOfLightAircraft = 0.005;
		double probabilityOfGlider = 0.005;


		//Create aircraft to be used in simulation
		Aircraft commercialFlight1 = new CommercialFlight(probabilityOfCommercialFlight);

	}

	public void stopSimulation () {
		simulationActive = false;
	}

	public void beginSimulation() {
		simulationActive = false;
		doSimulation();
	}

	/**
	 *JAVADOC...
	 */
	private void doSimulation() {
		//LOOP THROUGH SIMULATION
		//
		// while(simulationActive) {
		//
		//		if( y < randomNumber < x ) {
		//			generateAnAircraft()
		//		}
		// }

		// To do: Aircraft factory??
	}

	public void timeStep( int stepAmount ) {
		currentTime += stepAmount;
	}

	public void printSummary() {

	}

}
