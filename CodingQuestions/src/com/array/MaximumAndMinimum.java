package com.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumAndMinimum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 5, 6, 4, 3, 7, 100, 100, 8, 9, 7, 6, 8, 9);
		Integer min = list.stream().distinct().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum is : " + min);

		Integer max = list.stream().distinct().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum is : " + max);
	}
}
