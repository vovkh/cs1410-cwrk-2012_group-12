import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author owner
 *
 */
public class Timer {

	private Simulation simulation;
	private Calendar simulationClock;
	private Calendar maxSimulationTime;
	private int tickSize_seconds;
	
	/**
	 * Constructor for the Timer class. 
	 * @param _simulation A link back to the simulation that created this Timer
	 * @param _maxSimulationTime_secs the number of seconds that the simulation may run for
	 * @param _tickSize_secs the length of each 'tick' in seconds
	 */
	public Timer (Simulation _simulation, int _maxSimulationTime_secs, int _tickSize_secs) {
		createTimers_Calendar(_simulation, _maxSimulationTime_secs, _tickSize_secs);
	}

	private void createTimers_Calendar(Simulation _simulation, int _maxSimulationTime_secs, int _tickSize_secs) {
		this.simulation = _simulation;
		this.tickSize_seconds = _tickSize_secs;
		
		simulationClock = Calendar.getInstance();
		simulationClock.set(2000, 0, 0, 0, 0, 0); //NB: Arbitrary year *after* the 1970 epoch, to keep the date math simple (ie, positive milliseconds)

		this.maxSimulationTime = Calendar.getInstance();
		this.maxSimulationTime.set(2000, 0, 0, 0, 0, 0); //NB: Arbitrary year *after* the 1970 epoch, to keep the date math simple (ie, positive milliseconds)
		this.maxSimulationTime.add(Calendar.SECOND, _maxSimulationTime_secs);
	}
	
	@SuppressWarnings("unused")
	private void createTimers_GregorianCalendar(Simulation _simulation, int _maxSimulationTime_secs, int _tickSize_secs) {
		this.simulation = _simulation;
		this.tickSize_seconds = _tickSize_secs;
		
		simulationClock = new GregorianCalendar(0, 0, 0, 0, 0, 0);

		this.maxSimulationTime = new GregorianCalendar(0, 0, 0, 0, 0, 0);
		this.maxSimulationTime.add(Calendar.SECOND, _maxSimulationTime_secs);
	}

	
	public boolean isMaxSimulationTimeExceeded() {
		if( simulationClock.getTimeInMillis() >= maxSimulationTime.getTimeInMillis() ) {
			return true;
		}
		
		return false;
	}
	
	public void advanceByTick() {
		simulationClock.add(Calendar.SECOND, tickSize_seconds);
		
		/*System.out.println(simulationClock.getTimeInMillis() + " >= " + maxSimulationTime.getTimeInMillis() + "\n" +
							"simulationClock >= maxSimulationTime = " + "\n" +
							(simulationClock.getTimeInMillis() >= maxSimulationTime.getTimeInMillis()) );*/
		
	}
}
