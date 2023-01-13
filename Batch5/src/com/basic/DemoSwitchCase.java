package com.basic;

import java.util.Scanner;

public class DemoSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the number : ");
		switch (number) {

		case 1:
			System.out.println("Number is one");
			break;
		case 2:
			System.out.println("Number is Two");
			break;
		case 3:
			System.out.println("Number is Three");
			break;
		case 4:
			System.out.println("Number is Four");
			break;
		default:
			System.out.println("Plz provide valide number");
			break;
		}

	}

}
