package com.string;

import java.util.ArrayList;

/*
 * class X { void calculate(int a, int b) { System.out.println("Class X"); } }
 * 
 * class Y extends X {
 * 
 * @Override void calculate(int a, int b) { System.out.println("Class Y"); } }
 * 
 * class Z extends Y {
 * 
 * @Override void calculate(int a, int b) { System.out.println("Class Z"); } }
 * 
 * public class MainClass { public static void main(String[] args) { X x = new
 * Y();
 * 
 * x.calculate(10, 20);
 * 
 * // Y y = (Y) x; // // y.calculate(50, 100); // // Z z = (Z) y; // //
 * z.calculate(100, 200); } }
 */

class A {
	public A(int i) {
		System.out.println(myMethod(i));
	}

	int myMethod(int i) {
		return ++i + --i;
	}
}

class B extends A {
	public B(int i, int j) {
		super(i * j);
		System.out.println(i + "  " + j);
		System.out.println(myMethod(i, j));
	}

	int myMethod(int i, int j) {
		System.out.println(i + "  " + j);
		return myMethod(i * j);
	}
}

public class MainClass {
	public static void main(String[] args) {
		B b = new B(12, 21);
		ArrayList<Integer> list = new ArrayList<>();
	}
}

