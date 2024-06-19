package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterate {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("UP", "Lucknow");
		map.put("MP", "Bhopal");
		map.put("Bihar", "Patna");
		map.put("Tamil Nadu", "Chennai");
		map.put("Rajasthan", "Jaipur");
		map.put("West Bengal", "Kolkata");
		map.put("Nagaland", "Kohima");
		// Using keySet()
		System.out.println("Using key set method");
		for (String key : map.keySet()) {
			System.out.println("Key: " + key + " , Value: " + map.get(key));
		}
		System.out.println("---------------------------------------------------");
		// Iterating using entrySet()
		System.out.println('\n' + "Iterating using entrySet()");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
		}
		System.out.println("---------------------------------------------------");
		// Iterating using values()
		System.out.println('\n' + "Iterating using values()  ");
		for (String value : map.values()) {
			System.out.println("Value: " + value);
		}

		System.out.println("---------------------------------------------------");
		// Iterating using an iterator over entrySet()
		System.out.println('\n' + "Iterating using an iterator over entrySet()  ");
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
		}

		// Iterating using an iterator over keySet()
		System.out.println("---------------------------------------------------");
		System.out.println('\n' + "Iterating using an iterator over keySet() ");
		Iterator<String> iterator2 = map.keySet().iterator();
		while (iterator2.hasNext()) {
			String key = iterator2.next();
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}

		System.out.println("---------------------------------------------------");
		System.out.println('\n' + "Iterating using forEach()");
		// Iterating using forEach()
		map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

	}
}
