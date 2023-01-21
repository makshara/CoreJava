package com.corejava.training.day7;

public class MultiThreadExample extends Thread{

	public static void main(String[] args) {
		MultiThreadExample m1 = new MultiThreadExample();
		m1.start();
	}
	
	public void run() {
		System.out.println("Thread created - using extends Thread");
	}

}
