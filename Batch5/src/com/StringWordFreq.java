package com.java.array;

//String word frequency using collection

import java.util.HashMap;
import java.util.Map;

public class StringWordFrequency {

	public static void main(String[] args) {

		String s = "suraj is suraj";
		String a[] = s.split(" ");
		
		Map<String, Integer> letters = new HashMap<>();
		
		for (String str : a) {
			if (letters.containsKey(str)) {
				letters.put(str, 1 + letters.get(str));
			} else {
				letters.put(str, 1);
			}
		}
		System.out.println(letters);

	}

}
