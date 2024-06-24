package com.mukunda.java.oops.inheritance;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInInches) {
		super(age, gender, weightInInches);
	}
	public void fly() {
		System.out.println("flying . . .");
	}
	

}
