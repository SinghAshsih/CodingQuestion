package com.array;

import java.util.Arrays;
import java.util.Collections;

public class PrintTheElementOfArrayInReverseOrder {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6 };

		// using for loop
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		System.out.println('\n' + "-----------------------------------------------");

		// using java 8
		Arrays.stream(num).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
				.forEach(System.out::println);



	}
}