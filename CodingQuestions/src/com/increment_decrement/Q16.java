package com.increment_decrement;

public class Q16 {
	public static void main(String[] args) {
		char ch = "123".charAt(1);

		System.out.println(ch++ + ++ch);

// solution
		char ch2 = '2';
		System.out.println(ch2);
		int i = ch2++ + ++ch2;
		System.out.println(i);
	}
}
