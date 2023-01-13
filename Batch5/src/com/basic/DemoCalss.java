package com.basic;

public class DemoCalss {

	static int a;
	String b;

	public static void main(String[] args) {

		DemoCalss demoCalss = new DemoCalss();

		System.out.println(demoCalss.a);
		demoCalss.demoMethod();
	}

	public void demoMethod() {
		System.out.println("Demo Method");
	}

}
