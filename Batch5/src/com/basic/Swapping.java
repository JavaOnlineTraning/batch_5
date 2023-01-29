package com.basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Value for a :");
		int x = sc.nextInt();
		System.out.println("Enter Value for b :");
		int y = sc.nextInt();
	        System.out.println("Before swapping numbers: a=" +x + " b="+ y);  
	   
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swapping: a="+x + " b=" + y);
	}

}
