package com.java.basicCode;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
         //int number = 15;
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter any num");
         int num = sc.nextInt();
         
         if(num%2==0) {
        	 System.out.println(num+ " Num is even ");
        	 
         }else {
        	 System.out.println(num+ " Num is Odd");
         }	
       }

}
