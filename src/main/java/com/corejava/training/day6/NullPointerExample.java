package com.corejava.training.day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NullPointerExample extends Exception{
public NullPointerExample(String msg) {
	// TODO Auto-generated constructor stub
	super(msg);
}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws FileNotFoundException {
	tes();
	getPlayerScore("");
	}
public static void tes()  {
	// TODO Auto-generated method stub
	try {
		String a1 = null;
		System.out.println(a1.charAt(0));

	}catch(NullPointerException n) {
		System.out.println("Null Pointer");
	}catch(Exception n) {
		System.out.println("Null Pointer");
	}
	
}
public static int getPlayerScore(String playerFile) throws FileNotFoundException
		   {
		 
		    Scanner contents = new Scanner(new File(playerFile));
		    return Integer.parseInt(contents.nextLine());
		}
}
