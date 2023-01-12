package com.corejava.training.day1;

public class Person extends InheritanceExample{
	public Person() {
		//super();
		System.out.println("******** Person ********");

		// TODO Auto-generated constructor stub
	}
	public void getName() {
		System.out.println("firstName");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******** Inheritance ********");
		InheritanceExample inheritExample = new Person();
		inheritExample.firstName1="";
		inheritExample.setName("Yash");
		inheritExample.getName();
		
		System.out.println("******** Encapsulation ********");
		EncapsulationExample encapExample = new EncapsulationExample();
		encapExample.setAccountNumber(12345);
		encapExample.getAccountNumber();
		
		System.out.println("******** Abstraction ********");
		//AbstractionExample absExample = new AbstractionExample();
		Person p =new Person();

	}

}
