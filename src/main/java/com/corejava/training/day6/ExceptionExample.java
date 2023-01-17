package com.corejava.training.day6;

public class ExceptionExample {

	public static void main(String[] args) throws NullPointerExample {
		// TODO Auto-generated method stub
		arthmeticException();
		throw new NullPointerExample("error from 0000");

	}
	
	static void arthmeticException() {
		try {
			int a = 20, b = 0;
			int c = a/b;
			System.out.println("Result of (a/b) = "+c);
		}catch(ArithmeticException e) {
			System.out.println("Division with zero");
		}
	}

}
