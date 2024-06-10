package com.increment_decrement;

public class Q5 {
	public static void main(String[] args) {
		int i = 1, j = 2, k = 3;

		int m = i-- - j-- - k--;   // 1- 2 -3 = -4

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m=" + m);
	}
}
