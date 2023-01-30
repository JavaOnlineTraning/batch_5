package com.basic;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int a,b;
		Scanner Sc = new Scanner(System.in);
		System.out.println("plz Enter the Number");
		a = Sc.nextInt();
		b = Sc.nextInt();
		System.out.println("Before swapping number;" + a +" " + b);
		a = a+b;
		b =a-b;
		a= a-b;
		System.out.println("After swapping Number:" + a +" "+b);
		System.out.println();

	}

}
