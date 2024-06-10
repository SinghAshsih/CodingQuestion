package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 10, 20, 30, 15, 4, 9, 87, 45, 87, 90, 12, 23);
		Integer integer = list.stream().sorted().skip(1).findFirst().get();
		System.out.println(integer);
		Integer integer2 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(integer2);
	}
}
