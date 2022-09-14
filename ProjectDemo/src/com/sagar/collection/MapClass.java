package com.sagar.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		HashMap <Integer, String> map = new HashMap <Integer, String>();
		map.put(100, "Sagar");
		map.put(200, "Amol");
		map.put(300, "Rahul");
		map.put(400, "Vishal");
		Set<Integer> s = map.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("key=" +i);
			System.out.println("value=" +map.get(i));
			}
	}

}
