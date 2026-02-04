package com.json;

import org.json.JSONObject;
public class CarObject {
	public static void main(String[] args)
	{
		Car c=new Car("Toyota","Innova",2026);
		//convert car object to json
		JSONObject jsonObject=new JSONObject(c);
		System.out.println(jsonObject.toString());
		
	}

}
