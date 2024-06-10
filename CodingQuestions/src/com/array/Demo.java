package com.array;

public class Demo {
	public static void main(String[] args) {

		int[] numbers = { 9, 7, 1, 2, 3 };
		int smallest = findSmallest(numbers);
		System.out.println(smallest);
	}

	public static int findSmallest(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}
