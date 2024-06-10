package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMaximiumElement {

	public static void main(String[] args) {
		Integer[] arr = { 13, 24, 74, 75, 88, 84 };
		List<Integer> collect = Arrays.stream(arr).sorted((x, y) -> (y - x)).collect(Collectors.toList());
		Integer integer = collect.get(1);
		System.out.println(integer.intValue());

	}
}
