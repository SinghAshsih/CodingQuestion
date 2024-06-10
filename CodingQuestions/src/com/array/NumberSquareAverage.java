package com.array;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);
		double asDouble = list.stream().map(x->x*x).filter(x->x>100).mapToDouble(x->x).average().getAsDouble();
		System.out.println(asDouble);
	}
}
