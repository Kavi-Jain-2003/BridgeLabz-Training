package email;

import java.util.*;

public class EmailAccessControl {
	public static boolean checkEmail(String email) {
		if(email.matches(".*\\s+.*")||email.matches("^[^@.a-zA-Z0-9]$"))
		{
			return false;
		}
		if(!email.contains("@"))
		{
			return false;
		}
		String[] split = email.split("@");
		if (!split[0].matches(".*[a-z]{3,}[0-9]{4,}.*")) {
			return false;
		}
		String[] domain = split[1].split("\\.");
		if(domain.length!=3)
		{
			return false;
		}
		if (!domain[0].matches("sales|marketing|IT|product")) {
			return false;
		}
		if (!(domain[1].equals("company") && domain[2].equals("com"))) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] emails = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			emails[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			boolean valid = checkEmail(emails[i]);
			if (valid) {
				System.out.println("Access granted");
			} else {
				System.out.println("Access denied");
			}
		}
		sc.close();
	}

}
