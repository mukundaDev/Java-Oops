package com.mukunda.java.oops;


interface Flyable{
	void fly();
}

class Aeroplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("Aeroplane is flying");		
	}
}
class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}		
}


public class InterfaceExample {

	public static void main(String[] args) {

		Flyable flyable = new Bird();
		flyable.fly();
		
	}

}
