package com.sagar.collection1;

import java.util.HashSet;

public class SetClass {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		set.add("Sagar");
		set.add("Amol");
		set.add("Rahul");
		set.add("Vishal");
		
		for(String str : set) {
			System.out.println(str);
			
		}
	}

}
