package com.json;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
class Student // POJO class
{
	public String name;
	public int age;

	Student(String name, int age) {
		this.name=name;
		this.age=age;
	}

}

public class ListToJSONArray {
	public static void main(String[] args) throws Exception
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("Alice",21));
		list.add(new Student("Bob",22));
		ObjectMapper m=new ObjectMapper();
		String jsonArray=m.writeValueAsString(list);
		System.out.println(jsonArray);
		
		
	}
}
