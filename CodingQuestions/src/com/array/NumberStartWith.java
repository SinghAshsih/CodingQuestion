package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, -22, 26, 35, 26, 78, 20, 14, 13, 23);
		List<Integer> collect = list.stream().map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("2") || e.startsWith("-")).map(Integer::valueOf)
				.collect(Collectors.toList());
		collect.forEach(System.out::println);

	}
}
