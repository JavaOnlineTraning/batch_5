package com.basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
			int x,y,t;// x & y swapping
			Scanner sc= new Scanner(System.in);
					System.out.println("Enter the value of x & y");
			x=sc.nextInt();
			y=sc.nextInt();
			System.out.println("Before Swapping No: "+x +" "+y);
			t=x;
			x=y;
			y=t;
			System.out.println("After Swapping No: "+x +" "+y);
			System.out.println();
		}
		}


