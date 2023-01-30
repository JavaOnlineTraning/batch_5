package com.basic;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b,c;
		Scanner Sc = new Scanner (System.in);
    System.out.println("Enter The Number");
    a=Sc.nextInt();
    b=Sc.nextInt();
    System.out.println("before swapping number :"+a+" "+b);
    c=a;
    a=b;
    b=c;
    System.out.println("after swapping number :"+a+" "+b);
    System.out.println();
	}

}
