package com.array;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };
		System.out.println("======Duplicates Using Brute Force======");

		findDuplicatesUsingBruteForce(inputArray);
	}

	// Method 1 Brute force
	private static void findDuplicatesUsingBruteForce(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					System.out.println("Duplicate Element : " + inputArray[i]);
				}
			}
		}

	}
}
