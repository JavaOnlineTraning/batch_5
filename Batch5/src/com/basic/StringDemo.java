package com.basic;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "java";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s1.concat(" Program");
		System.out.println(s1);
			
	}
	
}
