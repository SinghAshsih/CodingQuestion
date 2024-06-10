package com.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccurance {
	public static void main(String[] args) {
		String input = "java, c++, c, ruby, java, net, java, html";
		Map<String, Long> occurences = Arrays.stream(input.split(",\\s*"))
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		occurences.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}

