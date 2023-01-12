package com.corejava.training.day1;

public class AbstractionExample {
	
	private String lastName;
	
	AbstractionExample(){
		lastName = "reddy";
		System.out.println("AbstractionExample");
	}
	
	AbstractionExample(String lastName){
		//super();
		this.lastName = lastName;
		System.out.println("AbstractionExample -1");

	}
	
	public static void main(String[] args) {
		//AbstractionExample absExample = new AbstractionExample();
		AbstractionExample absExample1 = new AbstractionExample("yash");
		}
	
	public void getFood() {
		String food = "rest";
		System.out.println("Food");
	}

}
