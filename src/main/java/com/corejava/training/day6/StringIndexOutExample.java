package com.corejava.training.day6;

public class StringIndexOutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s1 = "abcdefgh";
			System.out.println(s1.charAt(10));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bound exception");
		}
	}

}
