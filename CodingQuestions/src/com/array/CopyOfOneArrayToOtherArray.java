package com.array;

import java.util.Arrays;

public class CopyOfOneArrayToOtherArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		copyOfArray(arr1);
		copyOfArray2(arr1);
		copyOfArray3(arr1);
		copyOfArray4(arr1);

	}

	private static void copyOfArray4(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------------------------------");

	}

	private static void copyOfArray3(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.println("==========================================================");
		int[] arr2 = arr1.clone();
		System.out.println("Old Array ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("New Array after copy");
		System.out.println(Arrays.toString(arr2));

	}

	private static void copyOfArray2(int[] arr1) {
		// TODO Auto-generated method stub
		System.out.println("==========================================================");
		System.out.println("By second appoarch");
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("Old Array ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("New Array after copy");
		System.out.println(Arrays.toString(arr2));

	}

	private static void copyOfArray(int[] arr1) {
		// TODO Auto-generated method stub
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("Old Array ");
		System.out.println(Arrays.toString(arr1));
		System.out.println("New Array after copy");
		System.out.println(Arrays.toString(arr2));

	}
}
