package com.basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b,c;
		Scanner Sc = new Scanner(System.in);
		System.out.println("plz Enter the Number");
		a=Sc.nextInt();
		b=Sc.nextInt();
		System.out.println("Before swapping Number:" +a+"  "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping Number:" +a+" "+b);
		System.out.println();

	}

}
