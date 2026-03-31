package com.json;
import com.fasterxml.jackson.databind.ObjectMapper; 
public class ValidateJSON {
	public static void main(String[] args)
	{
		String json="{\"name\":\"Alice\",\"age\":21}";
				ObjectMapper m=new ObjectMapper();
		try
		{
			m.readTree(json);
			System.out.println("Valid JSON");
		}
		catch(Exception e)
		{
			System.out.println("Invalid JSOn");
		}
	}

}
