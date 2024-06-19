package com.exception;

public class Q1 {
	public static void main(String[] args) {
		try {
			main(args);
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(1);
		} catch (Exception | Error e) {
			System.out.println(2);
			System.out.println(e.getMessage());
		}
	}
}
class SuperClass
{
    void anyMethod() throws NullPointerException
    {
        System.out.println("Super Class Method");
    }
}
 
class SubClass extends SuperClass
{
    @Override
    void anyMethod() throws ArithmeticException, NumberFormatException, ClassCastException
    {
        System.out.println("Sub Class Method");
    }
}