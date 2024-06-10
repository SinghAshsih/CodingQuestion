package com.increment_decrement;

public class Q7 {
	public static void main(String[] args) {
		int i = 19, j = 29, k;                                 // i=19 ,18 ,19 ,18,19
                                                              // j = 29 ,28 ,29,28,29
		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;    // k=19 - 18 + 28 -29 +18-29+19-28 

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
	}
}
