package com.basic;

import java.util.Scanner;

public class NumSwapping {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter The Number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping Number :" + a + " " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping Number :" + a + " " + b);
		System.out.println();

	}

}
