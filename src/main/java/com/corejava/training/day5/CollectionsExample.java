package com.corejava.training.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a1 = new ArrayList();
		a1.add("a");
		a1.add(1);
		a1.add(1.1f);
		printList(a1);
		getList();
		getSet();
		getMap();
	}
	
	/**
	 * List:-
	 * 1. duplicates allowed
	 * 2. accepts null
	 * 3. insertion order preserved
	 * 4. 
	 */
	static void getList() {
		List<String> s1 = new ArrayList<String>();
		s1.add(0,"aa");
		s1.add(1,"bb");
		s1.add("cc");
		s1.add("dd");
		s1.add(3,"aa");
		s1.add(null);
		printList(s1);
	}
	
	static void printList(List l) {
		for(int j=0; j < l.size(); j++) {
			System.out.println(l.get(j));
		}
	}
	/**
	 * Set:-
	 * 1. No duplicates
	 * 2. accepts null
	 * 3. not ordered
	 */
	static void getSet() {
		Set s1 = new HashSet();
		s1.add(null);
		s1.add("ee");
		s1.add("bb");
		s1.add("cc");
		s1.add("dd");
		s1.add("aa");
		printSet(s1);
	}
	static void printSet(Set s) {
		for(Object str:s) {
			System.out.println(str);
		}
	}
	/**
	 * Map:-
	 * 1. duplicates keys override
	 * 2. Ordered
	 * 3. keys unique - stored in set
	 * 4. 
	 */
	
	static void getMap() {
		Map<String,String> m1 = new HashMap();
		m1.put("1", "m1");
		m1.put("1", "m1-dupe");
		m1.put("2", "m1");
		m1.put(null, "m-null");
		m1.put("11", null);
		m1.put("3", "m3");
		m1.put("5", "m5");
		printMap(m1);
	}
	static void printMap(Map<String, String> m) {
		for(Map.Entry<String, String> e: m.entrySet()) {
			System.out.println("Key is: "+ e.getKey() +" Value is: "+e.getValue());
		}
	}
}
