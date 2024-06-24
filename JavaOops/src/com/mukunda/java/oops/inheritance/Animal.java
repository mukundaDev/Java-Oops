package com.mukunda.java.oops.inheritance;

public abstract class Animal {

	
	int age;
	String gender;
	int weightInInches;
	
	public Animal(int age, String gender, int weightInInches)
	{
		this.age = age;
		this.gender = gender;
		this.weightInInches = weightInInches;
	}

	
	public void eat() {
		System.out.println("eating. . .");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
	public abstract void move();

}
