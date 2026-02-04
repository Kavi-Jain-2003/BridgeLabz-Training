package com.json;
import java.io.File;
import java.util.Iterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public class ReadAllKey {

	public static void main(String[] args) throws Exception
	{
		ObjectMapper m=new ObjectMapper();
		JsonNode root=m.readTree(new File("user.json"));
		
		Iterator<String> keys=root.fieldNames();
		while(keys.hasNext())
		{
			String key=keys.next();
			System.out.println(key+":"+root.get(key));
		}
		
	}
}
