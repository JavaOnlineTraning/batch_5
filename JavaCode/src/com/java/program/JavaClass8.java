package com.java.program;

@FunctionalInterface
interface Inter {

	public int m1(int a);

	default void m3() {
		System.out.println("hello java 8");
	}

	static void m4() {
		System.out.println("static call");
	}
}

public class JavaClass8  {

	public static void main(String[] args) {
		// TODO Auto-generated method

	Inter inter=a->a+a;
System.out.println(inter.m1(10));

}

}