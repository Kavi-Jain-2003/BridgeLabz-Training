package com.json;
import com.fasterxml.jackson.databind.*;
import java.util.Iterator;
public class ParseAndFilterJSON {
	public static void main(String[] args) throws Exception
	{
		 String json = "[{\"name\":\"Alice\",\"age\":21}," +
                 "{\"name\":\"Bob\",\"age\":28}," +
                 "{\"name\":\"Charlie\",\"age\":30}]";
		 
		 ObjectMapper m=new ObjectMapper();
		 JsonNode root=m.readTree(json);//or use userdefined json file
		 for(JsonNode node:root) //iterator
		 {
			 if(node.get("age").asInt()>25)
			 {
				 System.out.println(node.get("name").asText()+" - "+node.get("age").asInt());
			 }
		 }
	}

}
