package bank;

import java.util.*;

class Transaction {
	String type;
	int amount;
	int remainingLimit;

	Transaction(String type, int amount, int remainingLimit) {
		this.type = type;
		this.amount = amount;
		this.remainingLimit = remainingLimit;
	}
}

class CreditCard {
	List<Transaction> transactions;
	String cardNumber;
	String cardHolderName;
	int creditLimit;
	int availableLimit;

	CreditCard(String cardNumber, String cardHolderName, int creditLimit) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		this.availableLimit = creditLimit;
		this.transactions = new ArrayList<>();
	}
}

class Util {
	static HashMap<String, CreditCard> cardMap = new HashMap<>();

	public static int issueCard(String cardNumber, String cardHolderName, int creditLimit) {
		if (!cardMap.containsKey(cardNumber)) {
			CreditCard c = new CreditCard(cardNumber, cardHolderName, creditLimit);
			cardMap.put(cardNumber, c);
			return 1;
		}
		return 0;

	}

	public static int spendAmount(String cardNumber, int amount) {
		if (!cardMap.containsKey(cardNumber)) {
			System.out.println("Transaction declined");
			return 0;
		}
		CreditCard card = cardMap.get(cardNumber);
		if (amount <= card.availableLimit) {
			card.availableLimit -= amount;
			Transaction t = new Transaction("SPENT ", amount, card.availableLimit);
			card.transactions.add(t);
			System.out.println("SPENT" + cardNumber + " " + card.availableLimit);
		} else {
			System.out.println("Transaction declined");
			return 0;
		}
		return 1;

	}

	public static int makePayment(String cardNumber, int amount) {
		if (!cardMap.containsKey(cardNumber)) {
			System.out.println("card not found");
			return 0;
		}
		CreditCard card = cardMap.get(cardNumber);
		card.availableLimit += amount;
		if (card.availableLimit > card.creditLimit) {
			card.availableLimit = card.creditLimit;
		}
		Transaction t = new Transaction("PAYMENT", amount, card.availableLimit);
		card.transactions.add(t);
		System.out.println("PAYMENT done:" + cardNumber + " " + card.availableLimit);
		return 1;

	}

	public static void getCardsByHolder(String cardHolderName) {
		List<CreditCard> list = new ArrayList<>();
		for (CreditCard card : cardMap.values()) {
			if (card.cardHolderName.equals(cardHolderName)) {
				list.add(card);
			}
		}
		if (list.isEmpty()) {
			System.out.println("no cards found");
			return;
		}
		Collections.sort(list, (a, b) -> a.cardNumber.compareTo(b.cardNumber));

		for (CreditCard c : list) {
			System.out.println(c.cardNumber + " " + c.availableLimit);
		}
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Util u = new Util();
		int n = sc.nextInt();
		sc.nextLine();
		String[] output = new String[n];
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] split = input.split(" ");
			String operation = split[0];
			if (operation.equals("ISSUE")) {
				String cardNumber = split[1];
				String cardHolder = split[2];
				int creditLimit = Integer.parseInt(split[3]);
				u.issueCard(cardNumber, cardHolder, creditLimit);

			} else if (operation.equals("SPEND")) {
				String cardNumber = split[1];
				int amount = Integer.parseInt(split[2]);
				u.spendAmount(cardNumber, amount);
			} else if (operation.equals("PAYMENT")) {
				String cardNumber = split[1];
				int amount = Integer.parseInt(split[2]);
				u.makePayment(cardNumber, amount);

			} else if (operation.equals("HOLDER")) {
				String holderName = split[1];
				u.getCardsByHolder(holderName);
			}
		}
	}

}
