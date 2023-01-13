package com.basic;

import java.util.Scanner;

public class DemoIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		// int a = 20;
		int rem = a % 2;
		if (rem == 0) {
			System.out.println("Even");
			// System.out.println(a+10);
		} else
			System.out.println("Odd");

	}
}
