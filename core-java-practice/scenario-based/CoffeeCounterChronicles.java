//The Coffee Counter Chronicles. Ravi runs a café. Each customer orders different coffee types with quantities. Write a program that:
//importing Scanner class
import java.util.Scanner;

public class CoffeeCounterChronicles {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println(
					"\nEnter coffee type (Espresso / Latte / HotChocolate / Americano) or type 'exit' to stop:");
			// user input
			String coffeeType = input.nextLine();
			if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed ");
                break;
            }

			double price = 0;
			//switch case for coffeeType

			switch (coffeeType) {
				case "Espresso":
					price = 100;
					break;
				case "Latte":
					price = 140;
					break;
				case "HotChocalate":
					price = 150;
					break;
				case "Americano":
					price = 80;
					break;
				default:
					System.out.println("invalid coffeeType");
					continue;
			}
			System.out.println("enter quantity:");
			int quantity = input.nextInt();
			double total = price * quantity;
			// 5% gst on total
			double gst = total * 0.05;
			double finalBill = total + gst;

			// output
			System.out.println("BillAmount:" + total);
			System.out.println("GST:" + gst);
			System.out.println("FinalBill:" + finalBill);
		}
		// closing input
		input.close();		
	}
}
