package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = list.stream().mapToInt(x -> x).sum();
		System.out.println(sum);

		Optional<Integer> sum2 = list.stream().reduce((x, y) -> x + y);
		System.out.println(sum2.get());

	}
}
