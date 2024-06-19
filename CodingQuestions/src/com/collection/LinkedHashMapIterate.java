package com.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapIterate {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("UttarPradesh", "Shri Yogi Aditya Nath");
		map.put("West Bengal", "Km. Mamata Banerjee");
		map.put("Uttarakhand", "Shri Pushkar Singh Dhami");
		map.put("Tripura", "Dr. Manik Saha");
		map.put("Telangana", "Shri A Revanth Reddy");
		map.put("Tamil Nadu", "Shri M. K. Stalin");
		map.put("Sikkim", "Shri PS Golay");
		map.put("Rajasthan", "Shri Bhajan Lal Sharma");
		map.put("Punjab", "Shri Bhagwant Singh Mann");
		map.put("Bihar", "Shri Nitish Kumar");

		// using keySet()
		for (String key : map.keySet()) {
			System.out.println("State :->  " + key + '\t' + "Cheif Minister :->  " + map.get(key));
		}
		System.out.println("----------------------------------------------------------------------");

		// Iterating using an iterator over keySet()
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("State :->  " + key + '\t' + "Cheif Minister :->  " + map.get(key));
		}

		System.out.println("=======================================================================");

		// Iterating using entrySet()
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("State :->  " + entry.getKey() + '\t' + "Cheif Minister :->  " + entry.getValue());
		}

		// using entrySet()
		System.out.println("*************************************************************************");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("State :->  " + entry.getKey() + '\t' + "Cheif Minister :->  " + entry.getValue());
		}

		// using forEach() java 1.8
		System.out.println("----------------------------------------------------------------------");
		map.forEach((k, v) -> System.out.println("State :->  " + k + '\t' + "Cheif Minister :->  " + v));

	}
}
