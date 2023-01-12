package com.corejava.training.day1;

public class PolymorphismExample {

	public void Car(){
		System.out.println("car");
	}
	
	public void Car(String color) {
		System.out.println("Color of the car is "+ color);
	}
	
	public void Car(String color, String name) {
		System.out.println("Color of the car is "+ color + ", Name is " + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismExample polyExample = new PolymorphismExample();
		polyExample.Car();
		polyExample.Car("black");
		polyExample.Car("White", "Honda");
		System.out.println("ARG 1 "+args[0]);
		System.out.println("ARG 2 "+args[1]);

	}
}
