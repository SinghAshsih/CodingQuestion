package com.exception;

public class Test {

	public static void main(String[] args) {
		String[] s = { "abc", "123", null, "xyz" };
//		int p = Integer.parseInt(s[1]);
//		System.out.println(p);

		for (int i = 0; i < 6; i++) {
//			
			try {
				int a = s[i].length() + Integer.parseInt(s[i]);
//				
			} catch (NumberFormatException e) {
				System.out.println(1);
			} catch (NullPointerException e) {
				System.out.println(2);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(3);
			}
		}
	}

}
