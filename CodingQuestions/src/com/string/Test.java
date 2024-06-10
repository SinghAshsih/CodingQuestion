package com.string;

class Test {
	public static void main(String[] args) {
		String s1 = "Ashish";
		String s2 = new String("ashish");
		String s3 = s1.intern();
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s3 == s1);
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}

class Test2 {
	public static void main(String[] args) {
		String s1 = new String("Ashish");
		String s2 = s1;
		String s3 = s1.intern();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
}

class Test3 {
	public static void main(String[] args) {
		String s1 = "Ashish";
		String s2 = new String("Ashish");
		String s3=s2.intern();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
}