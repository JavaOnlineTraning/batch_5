package Programming;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
	     System.out.println("enter the value of a");

     int a = s.nextInt();
    int rem=a%2;
    if(rem==0) {
    	System.out.println("a is even");
    	}
    
    else {
    	System.out.println("a is odd");
    	}
    }
}
