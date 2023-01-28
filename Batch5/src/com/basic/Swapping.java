package com.basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
	

		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before swapping values of a and b are"+a+" "   +  b);

		c = a;
		a = b;
		b = c;

		System.out.println("Values of a n b are" + a  +" " + b);

	}
}
