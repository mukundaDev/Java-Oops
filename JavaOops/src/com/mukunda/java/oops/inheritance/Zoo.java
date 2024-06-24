package com.mukunda.java.oops.inheritance;

public class Zoo {

	public static void main(String[] args) {
		
//		Animal animal1 = new Animal(12, "M", 162);
//		animal1.eat();
//		animal1.sleep();
		Animal sparrow1 = new Sparrow(12, "F", 12);
		//sparrow1.move();
		
		Animal fish1 = new Fish(04, "M", 42);
		//fish1.move();
		
		moveAnimals(fish1);
		moveAnimals(sparrow1);
		
		Flyable flyable1 = new Sparrow(12, "F", 46);	
		//Flyable flyable2 = new Bird(12, "F", 46);	
		
	}
	
	public static void moveAnimals(Animal animal)
	{
		animal.move();
	}

}
