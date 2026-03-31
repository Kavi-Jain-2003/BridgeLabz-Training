import java.util.*;

class RobotSafetyException extends Exception {
	RobotSafetyException(String message) {
		super(message);
	}
}

public class RobotHazardAuditor {
	public static double calculateHazardRisk(double armPrecision, int workDensity, double machineRiskFactor)
			throws RobotSafetyException {
		double hazardRisk=((1.0-armPrecision)*15.0)+(workDensity*machineRiskFactor);
		return hazardRisk;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Arm Precision(0.0-1.0):");
			double armPrecision = sc.nextDouble();
			if (armPrecision < 0.0 || armPrecision > 1.0) {
				throw new RobotSafetyException("Error: Arm Precision must be 0.0-1.0");
			}

			System.out.println("Enter Work Density(1-20):");
			int workDensity = sc.nextInt();
			if (workDensity < 1 || workDensity > 20) {
				throw new RobotSafetyException("Error: Worker density must be 1-20");
			}

			sc.nextLine();
			Map<String,Double> machineryStateMap=new HashMap<>();
			machineryStateMap.put("Worn",1.3);
			machineryStateMap.put("Faulty",2.0);
			machineryStateMap.put("Critical",3.0);
			
			System.out.println("Enter machinery State(Worn/Faulty/Critical):");
			String machineryState = sc.nextLine();
			
			if(!machineryStateMap.containsKey(machineryState))
			{
				throw new RobotSafetyException("Error: unsupported machinery State");
			}
			double machineRiskFactor=machineryStateMap.get(machineryState);
			
			double risk = calculateHazardRisk(armPrecision, workDensity, machineRiskFactor);
			System.out.println("Robot Hazard Risk Score:" + risk);
		} catch (RobotSafetyException e) {
			System.out.println("");
		}

		System.out.println();
	}
}