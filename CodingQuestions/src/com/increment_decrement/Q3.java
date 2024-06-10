package com.increment_decrement;

public class Q3 {
	public static void main(String[] args) {
		int i = 0;

		i = i++ - --i + ++i - i--;

		System.out.println(i);
	}
}

//solution:
//	
//	i:0 ,1 ,0 ,1
//	i= 0 - 0 + 1 -1 	