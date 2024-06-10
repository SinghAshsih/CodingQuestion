package com.array;

import java.util.Arrays;

public class PrintElementOfArray {
	public static void main(String[] args) {
		int[] arr = { 12, 13, 14, 15, 15, 2, 3, 4, 5, 6 };

		// By using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println('\n' + "-----------------------------------------------");
		// by using java 8 for each
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println('\n' + "-----------------------------------------------");

		// for using Arrays class
		System.out.println(Arrays.toString(arr));

		System.out.println('\n' + "-----------------------------------------------");
		// for using java 8 stream method
		Arrays.stream(arr).forEach((x -> System.out.print(x + " ")));
	}
}
