
public class FlightDetails {
	protected String flightNumber;
	protected String flightName;
	protected int passengerCount;
	protected int currentFuelLevel;

	FlightDetails(String flightNumber, String flightName, int passengerCount, int currentFuelLevel) {
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.passengerCount = passengerCount;
		this.currentFuelLevel = currentFuelLevel;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public int getCurrentFuelLevel() {
		return currentFuelLevel;
	}

}
