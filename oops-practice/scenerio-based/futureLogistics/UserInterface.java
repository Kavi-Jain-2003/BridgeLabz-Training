import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter the goods transport details:");
		String input = sc.nextLine();

		GoodsTransport goodsTransport = utility.parseDetails(input);
		if (goodsTransport == null) {
			sc.close();
			return;
		}
		String type = utility.findObjectType(goodsTransport);
		System.out.println("Transport id:" + goodsTransport.getTransportId());
		System.out.println("Date of Transport:" + goodsTransport.getTransportDate());
		System.out.println("Rating of the Transport:" + goodsTransport.getTransportRating());

		if (type.equals("BrickTransport")) {
			BrickTransport bt = (BrickTransport) goodsTransport;
			System.out.println("Quantity of bricks:" + bt.getBrickQuantity());
			System.out.println("Bricks price:" + bt.getBrickPrice());
		} else {
			TimberTransport tt = (TimberTransport) goodsTransport;
			System.out.println("type of timber:" + tt.getTimberType());
			System.out.println("timber price per kilos:" + tt.getTimberPrice());
		}
		System.out.println("Vehicle for transport:" + goodsTransport.vehicleSelection());
		System.out.println("Total Charge:" + goodsTransport.calculateTotalCharge());
		sc.close();
	}
}