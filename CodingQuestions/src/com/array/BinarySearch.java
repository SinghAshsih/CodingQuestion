package com.array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3,4,5,6,7,8,9,10,11,12,45,56,67};
		int index = Arrays.binarySearch(a, 45);
		System.out.println(index);
		
	}
}
