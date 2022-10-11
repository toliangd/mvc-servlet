package com.mvc.model;

public class Student {
	private int age;
	private String firstName;
	private String lastName;
	
	public Student(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return this.age;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
