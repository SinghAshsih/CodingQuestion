package com.overloading;

class A {

}

class B extends A {

}

class C extends B {

}

public class Q1 {
	static void overloadedMethod(A a) {
		System.out.println("ONE");
	}

	static void overloadedMethod(B b) {
		System.out.println("TWO");
	}
	static void overloadedMethod(C c) {
		System.out.println("Five");
	}

	static void overloadedMethod(Object obj) {
		System.out.println("THREE");
	}

	public static void main(String[] args) {
		C c = new C();

		overloadedMethod(c);
	}
}