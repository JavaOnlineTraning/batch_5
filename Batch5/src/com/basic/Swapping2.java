package com.basic;

public class Swapping2 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for X and Y");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		x=x+y;  // using 2 variables
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping X and Y");
		System.out.println(x+" "+y);
		
	

	}

}
