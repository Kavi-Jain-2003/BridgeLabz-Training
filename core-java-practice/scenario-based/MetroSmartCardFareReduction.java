// Metro Smart Card Fare Deduction. In Delhi Metro, fare varies by distance.
import java.util.Scanner;

public class MetroSmartCardFareReduction {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial smart card balance: ");
		double smartCardBalance = input.nextDouble();		
		//checking for balance then reducing fare from it
		while (smartCardBalance > 0) {
			System.out.print("\nEnter distance travelled (or -1 to exit): ");
			int distance = input.nextInt();
			if (distance == -1) {
				System.out.println("thank you for using Delhi metro");
				break;
			}

			double fare = (distance >= 50) ? 200 : 100;
			if (smartCardBalance >= fare) {
				smartCardBalance -= fare;
				System.out.println("Fare charges:" + fare + " Remaining Smartcardbalance=" + smartCardBalance);
			} else {
				System.out.println("Insufficient Balance");
				break;
			}
		}

		// close input
		input.close();
	}
}
