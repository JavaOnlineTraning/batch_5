package com.java.swap;

import java.util.Scanner;

public class SwapUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value for swaping");
		int a=sc.nextInt();
		int b=sc.nextInt();

		int c;
		
		
		System.out.println("number before swaping a=" + a + " b=" + b);
		// swaping using third variable
	c = a;
		a = b;
		b = c;
		System.out.println("number after swaping a=" + a + " b=" + b);

		// swaping without using third variable

//		a = a + b;
//		b = a - b;
//		a = a - b;
//
//		System.out.println("number after swaping a=" + a + " b=" + b);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
