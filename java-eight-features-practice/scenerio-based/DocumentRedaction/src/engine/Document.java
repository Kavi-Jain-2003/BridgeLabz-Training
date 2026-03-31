package engine;

import java.util.*;

public class Document {
	public static String operation(String input)
	{
		input=input.replaceAll("ID:[A-Z]{3}[0-9]{6}","ID:XXX******");
		
		input=input.replaceAll("ACCT-[0-9]{4}-[0-9]{4}-([0-9]{4})", "ACCT---$1");
		
		input =input.replaceAll("\\b(\\w+)(\\s+\\1\\b)+","$1");
		
		input=input.replaceAll("(\\W)+","$1");
		
		
		return input;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] output=new String[n];
		for(int i=0; i<n; i++)
		{
			String input=sc.nextLine();
			output[i]=operation(input);
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(output[i]);
		}
	}
}
