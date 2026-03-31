package com.json;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSONObject {
	public static void main(String[] args) throws Exception
	{
		ObjectMapper m=new ObjectMapper();
		JsonNode json1=m.readTree(new File("json1.json"));
		JsonNode json2=m.readTree(new File("json2.json"));
		
		ObjectNode mergedJson=m.createObjectNode();
		mergedJson.setAll((ObjectNode)json1);
		mergedJson.setAll((ObjectNode)json2);
		System.out.println(mergedJson.toString());
	}
}
