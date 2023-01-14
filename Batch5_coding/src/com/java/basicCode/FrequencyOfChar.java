package com.java.basicCode;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
         // Scanner sc =new Scanner(System.in);
          //System.out.println("Enter a sentence");
         // String s= sc.nextLine();
           String s ="Kundan";
           s = s.toLowerCase();
          System.out.println("Character\tFrequency");
          for (char ch ='a'; ch<='z';ch++) {
        	  
        	  int count =0;
        	  for(int i =0;i<s.length();i++) {
        		  if(ch==s.charAt(i)) {
        			  count++;
        		  }
        	  }
        		  if(count!=0) {
        			  System.out.println(ch+"\t\t"+count);
        		  }
        			  
        	  }
          }
          }
	


