package dynamic;

import java.util.*;

public class template {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String input[] = new String[n];
		String output[] = new String[n];

		// take all inputs first
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextLine();
		}

		// process inputs
		for (int i = 0; i < n; i++) {

			String[] split = input[i].split(" ");

			String result = "";
			String prefix = "";

			for (int j = 0; j < split.length; j++) {

				if (split[j].startsWith("${")) {

					String operation = split[j].substring(2, split[j].length() - 1);
					String[] opSplit = operation.split(":");

					if (opSplit[0].equals("UPPER")) {
						result = opSplit[1].toUpperCase();
					}

					else if (opSplit[0].equals("LOWER")) {
						result = opSplit[1].toLowerCase();
					}

					else if (opSplit[0].equals("DATE")) {

						String date[] = opSplit[1].split("-");

						int d = Integer.parseInt(date[0]);
						int m = Integer.parseInt(date[1]);
						int y = Integer.parseInt(date[2]);

						if (d >= 1 && d <= 31 && m >= 1 && m <= 12) {
							result = y + "/" + m + "/" + d;
						}

						else {
							result = "INVALID";
						}
					}

					else if (opSplit[0].equals("REPEAT")) {

						String[] word = opSplit[1].split(",");

						String wordToRepeat = word[0];
						int count = Integer.parseInt(word[1]);

						for (int k = 0; k < count; k++) {
							result += wordToRepeat;
						}
					}
				}

				else {
					prefix += split[j] + " ";
				}
			}

			output[i] = prefix + result;
		}

		// print all outputs together
		for (int i = 0; i < n; i++) {
			System.out.println(output[i]);
		}

	}
}
