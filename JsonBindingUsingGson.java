package com.project;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JsonBindingUsingGson {

	public static void main(String[] args) {
		
		/*From POJO to Json*/
		System.out.println(JsonBindingUsingGson.getUser());
		
		/*From Json to POJO*/
		String json = "{\"firstName\":\"Ashutosh\",\"lastName\":\"Rana\",\"project\":[\"One\",\"Two\",\"Three\"]}";
		Gson gson = new Gson();
		StudentModel student = gson.fromJson(json, StudentModel.class);
		System.out.println(student);
	}
	
	public static String getUser(){
		StudentModel student = new StudentModel();
		student.setFirstName("Ashutosh");
		student.setFirstName("Rana");
		List<String> project = new ArrayList<>();
		project.add("One");
		project.add("Two");
		project.add("Three");
		student.setProject(project);
		Gson gson = new Gson();
		String json = gson.toJson(student);
		return json;
	}
}
