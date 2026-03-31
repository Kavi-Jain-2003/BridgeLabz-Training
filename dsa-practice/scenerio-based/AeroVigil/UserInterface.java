import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter flight details:");
		
		try
		{
			String input=sc.nextLine();
			String[] details=input.split(":");
		
			String flightNumber=details[0];
			String flightName=details[1];
			int passengerCount=Integer.parseInt(details[2]);
			int currentFuelLevel=Integer.parseInt(details[3]);
			
			FlightUtil util=new FlightUtil(flightNumber,flightName,passengerCount,currentFuelLevel);
			//validations
			util.validateFlightNumber(flightNumber);
			util.validateFlightName(flightName);
			util.validatePassangerCount(passengerCount,flightName);
			//fuel calculations
			double fuelNeeded=util.calculateToFillTank(flightName, currentFuelLevel);
			System.out.println("fuel required to fill the tank:"+fuelNeeded+" litres..");
			sc.close();
		}catch(InvalidFlightException e)
		{
			System.out.println(e.getMessage());					
		}
		catch(Exception e)
		{
			System.out.println("invalid input format");
		}
	}

}

