package com.increment_decrement;

public class Q10 {
	public static void main(String[] args) {
		int a = 1;

		a = a++ + ++a * --a - a--; // 1+ 3 * 2 - 2

		System.out.println(a);
	}
}
