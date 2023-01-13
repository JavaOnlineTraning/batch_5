package com.basic;

public class DemoConstructor {

	int rollNo;
	String name;

	public DemoConstructor() {

		System.out.println("Java");
	}

	public static void main(String[] args) {
		DemoConstructor d = new DemoConstructor();
		System.out.println(d.rollNo + d.name);
	}

}
