package com.mukunda.java.oops.inheritance;

public class Bird extends Animal  {
	
	public Bird(int age, String gender, int weightInInches) {
		super(age, gender, weightInInches);
	}

	public void fly() {
		System.out.println("bird is flying");
	}

	@Override
	public void move() {
		
		System.out.println("flapping wings");		
	}

}
