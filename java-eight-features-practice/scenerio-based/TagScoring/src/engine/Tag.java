package engine;

import java.util.*;

public class Tag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] output = new String[n];

		for (int i = 0; i < n; i++) {
			int result=0;
			String prefix = "";
			boolean isInvalid=false;
			
			String input = sc.nextLine();
			String[] split = input.split("\\s+");

			for (int j = 0; j < split.length; j++) {
				if (split[j].matches("\\[(SUM|MUL|MAX|MIN):-?(0|[1-9][0-9]*)(,-?(0|[1-9][0-9]*))+\\]")) {
					String op = split[j];// [SUM:1,2,3]
					String withoutBracket = op.substring(1, op.length() - 1);// Sum:1,2,3
					String[] opSplit = withoutBracket.split(":");
					String[] num = opSplit[1].split(",");
			

					if (opSplit[0].equals("SUM")) {
						int total = 0;
						for(String s:num){
							int a = Integer.parseInt(s);
							total += a;
						}
						result = total;
					} else if (opSplit[0].equals("MUL")) {
						int total = 1;
						for(String s:num){
							int a = Integer.parseInt(s);
							total *= a;
						}
						result = total;
					} else if (opSplit[0].equals("MAX")) {

						int max = Integer.parseInt(num[0]);
						for(String s:num){
							int a = Integer.parseInt(s);
							if (a > max) {
								max = a;
							}
						}
						result = max;
					} else if (opSplit[0].equals("MIN")) {

						int min = Integer.parseInt(num[0]);
						for(String s:num){
							int a = Integer.parseInt(s);
							if (a < min) {
								min = a;
							}
						}
						result = min;
					}
					prefix+=result+" ";
				} 
				else if (split[j].contains("[") || split[j].contains("]")) {
					prefix+="ERROR";
					isInvalid=true;
					break;
				} else {
					prefix += split[j] + " ";
				}
			}
			
		if(isInvalid)
		{
			output[i]=prefix.trim();
		}
		else
		{
			output[i]=prefix.trim();
		}
	}
		for(String s:output)
		{
			System.out.println(s);
		}

	}

}
