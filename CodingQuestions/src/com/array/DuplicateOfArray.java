package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 5, 6, 2, 4, 6, 7 };
		duplicate(arr);
		duplicate2(arr);
	}

	private static void duplicate2(int[] arr) {
		System.out.println('\n'+"==================================================");
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int a : arr) {
			if (!set.contains(a)) {
				set.add(a);
			} else {
				list.add(a);
			}
		}
		list.stream().sorted().forEach(e -> System.out.print(e + " "));
	}

	private static void duplicate(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Duplicate are as follows :-  ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
