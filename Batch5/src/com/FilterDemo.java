package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
             //print the arraylist 
	public static void main(String[] args) {

		List<String> List = new ArrayList<>();
		List.add("snehal");
		List.add("gargi");
		List.add("Ankit");
		List.add("Arjun");

		// traditional way to implement
		for (String s : List) {
			if (s.startsWith("A")) {
				System.out.println(s);
			}
			
			//by using stream API - filter()always use predicate(); used here for condition (ie-A) check
			List.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(t));       
			//  t for test(); to store the value of filtered value.
			//void test(T t);
			//t-> System.out.println(t);
		}
		
	}

}
