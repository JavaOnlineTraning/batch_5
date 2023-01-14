package com.java.basicCode;
import java.util.Scanner;

// Prime number is a number that is greater than 1 and divided by 1 or itself only
public class primeNo {
	public static void main(String args[]){
		int from, to, flag = 0, mid = 0, sum = 0, count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter from no");
		from = sc.nextInt();  //user input
		System.out.print("Enter To no");
		to = sc.nextInt();    //user input
		for (int i = from; i <= to; i++) {
			
			mid=0;        //no need to traversing every value half traversing also enough to print the value 
			mid = i / 2; // that is why we are using here mid =i/2
			flag = 0;
		if(i==0 || i==1){

		}else{
			if(i>1){
			for(int j=2;j<=mid;j++){
				if(i%j == 0){
					flag = 1;
					
					break;
					
				}
			}
			
			if(flag == 0){
			//System.out.print(i+" is a prime no");
				System.out.print(i+" ");
				sum += i;
				count++;
			}else{
				//System.out.print(i+" is not a prime no");
			}
			}
		}
		}
		System.out.println();
		System.out.println("sum of all prime no between " + from + " and " + to + " is " + sum);
		System.out.println("count of all prime no between " + from + " and " + to + " is " + count);
	}

}
