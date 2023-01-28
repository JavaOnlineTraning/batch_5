package com.basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter The Number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping Number :" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping Number :" + a + " " + b);
		System.out.println();

	}

}
