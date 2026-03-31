import java.util.HashMap;
import java.util.Map;

public class FlightUtil extends FlightDetails {
	private static Map<String, Integer> passengerLimit = new HashMap<>();
	private static Map<String, Double> fuelCapacity = new HashMap<>();
	static {
		passengerLimit.put("SpiceJet", 396);
		passengerLimit.put("Vistara", 615);
		passengerLimit.put("IndiGo", 230);
		passengerLimit.put("Air Arabia", 130);

		fuelCapacity.put("SpiceJet", 200000.0);
		fuelCapacity.put("Vistara", 300000.0);
		fuelCapacity.put("IndiGo", 250000.0);
		fuelCapacity.put("Air Arabia", 150000.0);
	}

	FlightUtil(String flightNumber, String flightName, int passengerCount, int currentFuelLevel) {
		super(flightNumber, flightName, passengerCount, currentFuelLevel);
	}
	public boolean validatePassangerCount(int passengerCount, String flightName)
	        throws InvalidFlightException {

	    Integer limit = passengerLimit.get(flightName);

	    if (limit == null) {
	        throw new InvalidFlightException(
	            "The flight name " + flightName + " is invalid"
	        );
	    }

	    if (passengerCount <= 0 || passengerCount > limit) {
	        throw new InvalidFlightException(
	            "The passenger Count " + passengerCount +
	            " is invalid for " + flightName
	        );
	    }

	    return true;
	}
	public double calculateToFillTank(String flightName, double currentFuelLevel)
	        throws InvalidFlightException {

	    Double capacity = fuelCapacity.get(flightName);

	    if (capacity == null) {
	        throw new InvalidFlightException(
	            "Invalid flight name " + flightName
	        );
	    }

	    if (currentFuelLevel < 0 || currentFuelLevel > capacity) {
	        throw new InvalidFlightException(
	            "Invalid Fuel level for " + flightName
	        );
	    }

	    return capacity - currentFuelLevel;
	}



	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
			throw new InvalidFlightException("the fligt number " + flightNumber + " is invalid");
		}
		return true;
	}

	public boolean validateFlightName(String flightName) throws InvalidFlightException {
		if (!flightName.matches("\\b(SpiceJet|Vistara|IndiGo|Air Arabia)\\b")) {
			throw new InvalidFlightException("the fligt name " + flightName + " is invalid");
		}
		return true;
	}
}
//
//	public boolean validatePassangerCount(int passengerCount, String flightName) throws InvalidFlightException {
//		int spiceJetPC = 396;
//		int vistaraPC = 615;
//		int indiGoPC = 230;
//		int airArabiaPC = 130;
//		if (flightName.equalsIgnoreCase("SpiceJet")) {
//			if (passengerCount <= 0 || passengerCount > spiceJetPC) {
//				throw new InvalidFlightException(
//						"The passenger Count " + passengerCount + " is invalid for " + flightName);
//			}
//		}
//		if (flightName.equalsIgnoreCase("Vistara")) {
//			if (passengerCount <= 0 || passengerCount > vistaraPC) {
//				throw new InvalidFlightException(
//						"The passenger Count " + passengerCount + " is invalid for " + flightName);
//			}
//		}
//		if (flightName.equalsIgnoreCase("IndiGo")) {
//			if (passengerCount <= 0 || passengerCount > indiGoPC) {
//				throw new InvalidFlightException(
//						"The passenger Count " + passengerCount + " is invalid for " + flightName);
//			}
//		}
//		if (flightName.equalsIgnoreCase("Air Arabia")) {
//			if (passengerCount <= 0 || passengerCount > airArabiaPC) {
//				throw new InvalidFlightException(
//						"The passenger Count " + passengerCount + " is invalid for " + flightName);
//			}
//		}
//
//		return true;
//
//	}

//public double calculateToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
//		double spiceJetFuel = 200000;
//		double vistaraFuel = 300000;
//		double indiGoFuel = 250000;
//		double airArabiaFuel = 150000;
//		if (flightName.equalsIgnoreCase("SpiceJet")) {
//			if (currentFuelLevel < 0 || currentFuelLevel > spiceJetFuel) {
//				throw new InvalidFlightException("Invalid Fuel level for " + flightName);
//			} else {
//				return spiceJetFuel - currentFuelLevel;
//			}
//		}
//		if (flightName.equalsIgnoreCase("Vistara")) {
//			if (currentFuelLevel < 0 || currentFuelLevel > vistaraFuel) {
//				throw new InvalidFlightException("Invalid Fuel level for " + flightName);
//			} else {
//				return vistaraFuel - currentFuelLevel;
//			}
//		}
//		if (flightName.equalsIgnoreCase("IndiGo")) {
//			if (currentFuelLevel < 0 || currentFuelLevel > indiGoFuel) {
//				throw new InvalidFlightException("Invalid Fuel level for " + flightName);
//			} else {
//				return indiGoFuel - currentFuelLevel;
//			}
//		}
//		if (flightName.equalsIgnoreCase("Air Arabia")) {
//			if (currentFuelLevel < 0 || currentFuelLevel > airArabiaFuel) {
//				throw new InvalidFlightException("Invalid Fuel level for " + flightName);
//			} else {
//				return airArabiaFuel - currentFuelLevel;
//			}
//		}
//		return currentFuelLevel;
//
//	}
