package com.corejava.training.day4;

public class AccessModifierEg extends Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierEg accessEg =  new AccessModifierEg();
		
		Person p1 = new Person();
		p1.getName();
		System.out.println(p1.protectName);
	}

}
