package com.javaEightFeature;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {

		List<String> word = Arrays.asList("cup", null, "forest", "sky", null, "java");

		System.out.println(word);
		
		Set<String> collect = word.stream().filter(w -> w != null).collect(Collectors.toSet());
		System.out.println(collect);

	}

}
