package com.corejava.training.day7;

import java.util.ArrayList;
import java.util.List;

public class Test {
	static String s = "apple";
	int i = 1;
	char c ='a';
	float f = 1.1f;
	double d = 1.2324;
	short sh = 1;
	long l = 344444;
	boolean b = true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		System.out.println(s);
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.println("If - Else");
		if(t1.c == 'a') {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	
		List<Integer> l= new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		
		List<PersonListExample> pList = new ArrayList<PersonListExample>();
		PersonListExample ple1 = new PersonListExample();
		ple1.setfName("yash");
		ple1.setlName("reddy");
		ple1.setRollNo(1);
		pList.add(ple1);
		PersonListExample ple2 = new PersonListExample();
		ple2.setfName("aksh");
		ple2.setlName("reddy");
		ple2.setRollNo(3);
		pList.add(ple2);
		PersonListExample ple = new PersonListExample();
		ple.setfName("m");
		ple.setlName("rey");
		ple.setRollNo(4);
		pList.add(ple);
		
		System.out.println("For loop");
		for(int k=0; k<pList.size(); k++) {
			PersonListExample temp = (pList.get(k));
			System.out.println(temp.getRollNo()+"===="+temp.getfName()+"---"+temp.getlName());
		}
		
		System.out.println("While loop");
		int w = 5;
		while(w >= 0) {
			System.out.println(w);
			w--;
		}

	}

}
