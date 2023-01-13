package com.corejava.training.day2;

import java.util.List;

public class TypeOperators {
	static int a = 1;
	long b = 320;
	short c = 22;
	static double d = 2.2;
	float f  = 1.1f;
	String name = "god";
	static String num = "1235";
	static char intial = 'M';
	static boolean bool = true;
	static int[] array1;
	List<Integer> l;

	public static void main(String[] args) {
		
		switch(intial) {
		case 'a':{
			System.out.println('a'); break;
		}
		case 'M':{
			System.out.println('M'); break;
		}
		default: System.out.println("default");

		}
		array1 = new int[5];
		int array2[] = {1,2,3,4,5};
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		for(int j: array2) {
			System.out.println(j);
			if(j == 3) {
				break;
			}
		}
		int k = 0;
		while(k < array2.length) {
			System.out.println(array2[k]);
			k++;
		}
		
		a =(int)d;
		a = Integer.parseInt(num);
		Float.parseFloat(num);
		if(!bool) {
			System.out.println("TRue");
			a = 10;
			d += 1;
			
		}
	}

}
