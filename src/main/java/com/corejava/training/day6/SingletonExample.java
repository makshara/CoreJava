package com.corejava.training.day6;

public final class SingletonExample {
	String s = "yahs";
	private SingletonExample() {
		// TODO Auto-generated constructor stub
	}
	static private SingletonExample instance;
	
	public static SingletonExample getInstance() {
		if(instance == null) {
			instance = new SingletonExample();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonExample se = SingletonExample.getInstance();
		System.out.println(se.s);
		SingletonExample see = SingletonExample.getInstance();
		see.s = "aksh";
		
		System.out.println("fisrt: " +se.s +" Second: "+see.s);
	}

}
