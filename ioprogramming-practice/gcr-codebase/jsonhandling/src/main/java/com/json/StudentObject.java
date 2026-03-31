package com.json;
import org.json.JSONObject;
import org.json.JSONArray;
public class StudentObject {
	public static void main(String[] args)
	{
		JSONArray subjects=new JSONArray();
		subjects.put("JAVA");
		subjects.put("Spring");
		subjects.put("SQL");
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("name","Alice");
		
		jsonObject.put("Subjects",subjects);
		jsonObject.put("age",23);
		
		System.out.println(jsonObject.toString());
	}

}
