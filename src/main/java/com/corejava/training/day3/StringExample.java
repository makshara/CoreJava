package com.corejava.training.day3;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringExample {
	
	public static void main(String[] args) {
		StringBuffer s2 = new StringBuffer("s2");
		s2.append("new_s2");
		
		String s4 = s2.toString().replace("s2", "s4");
		s4.toString();
		StringBuffer s5 = new StringBuffer(s4);
		
		
		String s1 = new String("s1");
		s1.concat("new_s1");
		s1 = s1.replace("s1", "s6");
		
		StringBuilder s3 = new StringBuilder("s3");
		s3.append("new_s3");
		
		Date dt = new Date();
		Calendar c = Calendar.getInstance(Locale.ENGLISH);
		c.getWeekYear();
		
		String a1 = new String("new");
		String a2 = new String("new");
		String a3 = "new";
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());

			System.out.println("s1 hash value" +a1.equals(a2)+"---"+a1.equals(a3)+"==="+a3.equals(a2));
		
		
		
		System.out.println(s1);
		System.out.println(s2.hashCode());
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(dt);
		System.out.println(c.getWeekYear());
	}

}
