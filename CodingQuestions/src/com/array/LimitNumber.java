package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 10, 20, 30, 15, 4, 9, 87, 45, 87, 90, 12, 23);

		// limit 5 number sum
		List<Integer> listof5 = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(listof5);
		Integer integer = list.stream().limit(5).reduce((x, y) -> x + y).get();
		System.out.println(integer);

		// skip
		List<Integer> sk = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(sk);

	}
}
