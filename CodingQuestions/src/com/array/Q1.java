package com.array;

import java.util.HashMap;

public class Q1 {
	public static void main(String[] args) {
		/*
		 * There are two array objects of int type. One is containing 100 elements and
		 * another one is containing 10 elements. Can you assign an array of 100
		 * elements to an array of 10 elements?
		 */
		HashMap<Integer,Integer>hash=new HashMap<>();
		int[] a = new int[100];
		int[] b = new int[10];
		System.out.println(a.hashCode());
		System.out.println("============================");
		System.out.println(b.hashCode());
		b=a;
		System.out.println(a.hashCode());
		System.out.println("============================");
		System.out.println(b.hashCode());

	}
}
