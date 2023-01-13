package com.inheritance;

class A {
	public void m1() {
		System.out.println("Parent");
	}
}

class B extends A {
	public void m2() {
		System.out.println("Child");
	}
}

public class DemoInheritance {

	public static void main(String[] args) {

		/*
		 * B b = new B(); b.m1(); b.m2();
		 */
		/*
		 * A a = new A(); a.m1(); a.m2(); //CE
		 */

		/*
		 * A a = new B(); a.m1(); a.m2(); //CE
		 */
		
		/* B b = new A(); */
	}

}
