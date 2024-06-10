package com.increment_decrement;

public class Q13 {
	public static void main(String[] args) {
		int x = 001, y = 010, z = 100;

		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;

		System.out.println("x=" + x);  //001 ,0 ,-1 ,-2
		System.out.println("y=" + y);  //010 ,11 12 ,11
		System.out.println("z=" + z);  // 100 ,99 98
		System.out.println("i=" + i);  // 0 + 10 - 100 -98 +12 - (-1) +12 - (-2)
//		int cc=010;
//		System.out.println(cc);
//		int p=cc++ + ++cc +cc-- ;
//		System.out.println(cc);
	}
}
