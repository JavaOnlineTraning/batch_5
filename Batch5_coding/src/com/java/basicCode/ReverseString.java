package com.java.basicCode;

public class ReverseString {

	public static void main(String[] args) {
		  String str ="Hello Snehal",nstr =" ";
		  char ch;
		  System.out.print("Original String : ");
		  System.out.println("Hello Snehal");
		  
		  for(int i = 0;i<str.length();i++) {
			  ch = str.charAt(i);
			  
			  nstr = ch+nstr;
		  }
			  System.out.println("Reverse String : "  +nstr);
		  }

	}


