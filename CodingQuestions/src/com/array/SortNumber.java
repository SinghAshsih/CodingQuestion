package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 7, 4, 5, 6, 1, 2, 9, 0, 8, 1, 11, 12);
		List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);

		List<Integer> dese = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(dese);

		List<Integer> desc = list.stream().sorted((x, y) -> (y - x)).collect(Collectors.toList());
		System.out.println(desc);
	}
}
