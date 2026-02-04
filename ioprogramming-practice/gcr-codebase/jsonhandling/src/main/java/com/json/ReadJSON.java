package com.json;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ReadJSON {
	public static void main(String[] args) throws Exception
	{
		ObjectMapper om=new ObjectMapper();
		JsonNode user=om.readTree(new File("user.json"));
		System.out.println("User name:"+user.get("name").asText());
		System.out.println("User email:"+user.get("email").asText());
		
	}

}
//or
//import java.io.File;
//import java.util.Map;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class ReadJson {
//    public static void main(String[] args) throws Exception {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        Map<String, Object> user =
//                objectMapper.readValue(new File("user.json"), Map.class);
//
//        System.out.println("User Name: " + user.get("name"));
//        System.out.println("Skills: " + user.get("skills"));
//    }
//}