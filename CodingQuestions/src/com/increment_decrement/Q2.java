package com.increment_decrement;

public class Q2 {
	public static void main(String[] args) {
		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
}

//solution  
//
//a ;11, 12 ,13 
//b; 22, 23 ,24
//c; 11+22 +11+22 +13 +24