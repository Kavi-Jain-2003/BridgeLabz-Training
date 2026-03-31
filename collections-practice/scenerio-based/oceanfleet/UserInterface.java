import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil util=new VesselUtil();

		System.out.println("Enter no. of vessels to be added:");
		int vesselCount = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter vessel details:");
		for (int i = 0; i < vesselCount; i++) {
			String input = sc.nextLine();
			String[] data = input.split(":");

			Vessel vessel = new Vessel(data[0], data[1], Double.parseDouble(data[2]), data[3]);
			util.addVesselPerformance(vessel);

		}

		System.out.println("enter the vessel id to check speed:");
		String vesselIdToCheck = sc.nextLine();
		
		Vessel result =util.getVesselById(vesselIdToCheck);
		if(result!=null)
		{
			System.out.println(result.getVesselId() + "|" + result.getVesselName() + "|" + result.getVesselType()+"|"+result.getAverageSpeed()+"knots");
		}
		else
		{
			System.out.println("Vessel not found");
		}
		System.out.println("HighPerformance vessels:");
		List<Vessel> highPerformance =util.getHighPerformanceVessels();
		for (Vessel v : highPerformance) {
			System.out.println(v.getVesselId() + "|" + v.getVesselName() + "|" + v.getVesselType()+"|"+v.getAverageSpeed()+"knots");
		}
		sc.close();
	}

}
