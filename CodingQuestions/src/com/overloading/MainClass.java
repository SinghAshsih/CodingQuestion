package com.overloading;

class AA {
	private class B {
		// inner class
	}
}

public class MainClass extends AA {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("Hi");
	}
}