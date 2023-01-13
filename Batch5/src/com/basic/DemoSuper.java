package com.basic;

class P {

	public P() {

		System.out.println("Parent class cons");
	}
}
class C extends P {
	int a;

	public C(int a) {
		this.a = a;
		System.out.println("Child class cons");
	}
}

public class DemoSuper {

	public static void main(String[] args) {
		
		C c = new C(0);

	}

}
