package com.mukunda.java.oops;

abstract class Animal{
	String name;
}

class Dog extends Animal{
	
}

class Cat extends Animal{

	
}
public class InheritanceExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "Sheero";
		
		Cat cat = new Cat();
		cat.name = "Dhruv";
		
		System.out.println(dog.name);
		System.out.println(cat.name);

		
		
	}

}
