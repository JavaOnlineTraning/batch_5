package com.poly;

class Parent {
	public void property() {
		System.out.println("Cash|Land");
	}

	public void marray() {
		System.out.println("Shantabai");
	}
}

class Child extends Parent {
	
	int a;

	@Override
	public void marray() {
		System.out.println("Deepeeka");

	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.marray();

		Child c = new Child();
		c.marray();

		Parent p1 = new Child();
		p1.marray();
	}

}
