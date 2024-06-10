package com.array;

import java.util.Arrays;
import java.util.List;

interface Summ {
	public abstract void m1(int a, int b);
}

public class Sum {

	public static void main(String[] args) {
		// HashSet<String> set = new HashSet<>();
		// Summ sum = ((a, b) -> System.out.println(a + b));
		// sum.m1(20, 30);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer summ = 0;
		for (int i = 0; i < list.size(); i++) {
			summ = summ + list.get(i);
		}
		System.out.println(summ);
		int sum = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(sum);
	}

}
