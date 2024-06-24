package com.mukunda.java.oops.inheritance;

public class Fish extends Animal {

	public Fish(int age, String gender, int weightInInches) {
		super(age, gender, weightInInches);
	}
	
	
	public void move() {
		System.out.println("fish is swiming");
	}

}
