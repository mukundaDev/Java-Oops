package com.mukunda.java.oops.inheritance;

public class Chicken  extends Bird implements Flyable{

	public Chicken(int age, String gender, int weightInInches) {
		super(age, gender, weightInInches);
	}
	
	public void fly() {
		System.out.println("not able to fly");
	}
	
	public static void main(String[] args) {
		
		Chicken chick1 = new Chicken(12, "M", 87);
		chick1.fly();
		
	}
}