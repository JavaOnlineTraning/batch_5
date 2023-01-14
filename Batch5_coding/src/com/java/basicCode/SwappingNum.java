package com.java.basicCode;

import java.util.Scanner;

public class SwappingNum {

	public static void main(String[] args) {
          int x,y,z;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter value of x and y");
           
          x=sc.nextInt();
          y=sc.nextInt();
          
          System.out.println("before swapping number : "+x+" "+y);
          
          //Swapping
         /* z = x;
          x = y;
          y = z;*/
          
          x = x+y;   //x = 3,  y =5  y= 3+5 = 8
          y = x-y;    // x = 8 ,     y=5 = 3
          x = x-y;    // y = 3 ,     x=8-3 = 5 
                      // x = 5
          
          System.out.println("After Swapping : "+x+" "+y);
          System.out.println();
	}

}
