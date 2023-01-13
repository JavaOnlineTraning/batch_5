package com.basic;

public class DemoMethodReturnType {
	
	float a;

	DemoMethodReturnType() {

		System.out.println("Contructor is created");

	}

	public static void main(String[] args) {

		DemoMethodReturnType d = new DemoMethodReturnType();

		boolean methodWithBooleanRT = d.methodWithBooleanRT();

		System.out.println(methodWithBooleanRT);

		d.methodWithVoidRT(10);

		//d.simpleMethod();

	}

	public void simpleMethod() {

		System.out.println("SM");

	}

	public boolean methodWithBooleanRT() {

		System.out.println("Returning False");

		return true;
	}

	public void methodWithVoidRT(int a) {

		System.out.println("Void Return type");

	}

}
