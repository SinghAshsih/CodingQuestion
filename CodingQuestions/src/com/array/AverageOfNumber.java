package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4 );
		OptionalDouble average = list.stream().mapToDouble(x -> x).average();
		System.out.println(average.getAsDouble());
	}
}
