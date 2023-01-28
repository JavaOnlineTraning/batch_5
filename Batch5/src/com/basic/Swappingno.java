package com.basic;

import java.util.Scanner;

public class Swappingno {

	public static void main(String[] args) {
		int x, y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("Before swapping number:" +x +" " +y);
		
		//swapping 
		z= x;
		x= y;
		y= x;
		System.out.println("After swapping number: " +x+ " " +y);
		
		
		//Without using third variable
		 
		x=x+y;
		y=x-y;
		z=x-y;
		System.out.println("After swapping:" +x+" "+y);
		System.out.println();
	}

}
