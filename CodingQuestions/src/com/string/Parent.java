package com.string;

public class Parent {
public static void main(String[] args) {
	P c =new P();
	c.p();
}

}
class P{
	public void p() {
		System.out.println("p");
	}
}
abstract class C extends P{
	
	public abstract void p();
}
