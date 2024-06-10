package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbersInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 5, 6, 4, 3, 7, 100, 100, 8, 9, 7, 6, 8, 9);
		Set<Integer> collect = list.stream().filter(x -> Collections.frequency(list, x) > 1)
				.collect(Collectors.toSet());
		System.out.println(collect);

		// second methods
		Set<Integer> set = new HashSet<>();
		Set<Integer> collect2 = list.stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println(collect2);
		

	}
}
