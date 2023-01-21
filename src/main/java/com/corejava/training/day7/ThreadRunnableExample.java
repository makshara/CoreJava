package com.corejava.training.day7;

public class ThreadRunnableExample implements Runnable{

	public static void main(String[] args) {
		ThreadRunnableExample tre = new ThreadRunnableExample();
		Thread tr = new Thread(tre);
		tr.start();
		System.out.println(tr.getName());
	}
	
	public void run() {
		System.out.println("Thread using - Runnable Interface");
	}
}
