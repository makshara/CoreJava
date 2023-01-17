package com.corejava.training.day4;

public class AccesModifiersExample {
	protected String protectName2 = "Protect-Aksh";
	public String publicName = "public-name";
	
	public static void main(String[] args) {
		//Private
		Person p = new Person();
		p.setName("Private-Modified");
		System.out.println(p.getName());
		
		//Default
		p.defaultMessagee();
		
		//Protected
		System.out.println(p.protectName);
		
	}
	
	}

class Person{
	private String name = "private-Initial";
	protected String protectName = "Protect-Yash";
	public String publicName = "public-name";
	String defaultName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void defaultMessagee() {
		System.out.println("Default access modifier");
		System.out.println(name);
	}

}
