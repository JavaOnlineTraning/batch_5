package com.javaEightFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ashutosh", "ShivKumar", "Kishor", "Swapnil", "Pavan");

		// List<String> list2 = new ArrayList<>();

		// without stream
		/*
		 * for (String s : list) { if (s.length() > 6 && s.length() < 8) { list2.add(s);
		 * } } System.out.println(list2);
		 */

		// with stream

//		List<String> collect = list.stream().filter(s -> s.length() > 6 && s.length() < 8).collect(Collectors.toList());
//		System.out.println(collect);

		//list.stream().filter(s -> s.length() > 6 && s.length() < 8).forEach(System.out::println);
		list.stream().filter(s -> s.length() > 6 && s.length() < 8).forEach(s -> System.out.println(s));

	}

}
