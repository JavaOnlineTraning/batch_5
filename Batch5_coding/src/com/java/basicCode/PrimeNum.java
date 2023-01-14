package com.java.basicCode;

public class PrimeNum {

	public static void main(String[] args) {
		    int num = -7;
            int count=0;
            
            if(num>1) {
            	
            	for(int i=1;i<=num;i++) {
            		if(num%i == 0)
            			count++;
            	}
            	if(count==2)
            	{
            		System.out.println(num+" is Prime number");
            	}else {
            		System.out.println(num+" is Not a prime number");
            	}
            }else {
            	if(num==0) {
            		System.out.println("Number is 0");
            	}else {
            		System.out.println(num+ " is negative");
            	}
            }
	}

}
