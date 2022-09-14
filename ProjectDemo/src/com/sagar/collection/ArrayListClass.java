package com.sagar.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList <String> str = new ArrayList<String>();
		str.add("Sagar");
		str.add("Amol");
		str.add("Rahul");
		str.add("Vishal");
		for(String s : str) {
			System.out.println(str);
		}
		
	}

}
