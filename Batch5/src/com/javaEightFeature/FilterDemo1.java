package com.javaEightFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

		List<Integer> list = List.of(10, 20, 15, 5, 25);
		// List<Integer> asList = Arrays.asList(5,10,15,20,25);
		// List<Integer> list2 = new ArrayList<>();

		// without stream
		/*
		 * for (Integer i : list) { if (i % 2 == 0) { list2.add(i); }
		 * 
		 * } System.out.println(list2);
		 */

		/*
		 * List<Integer> list2 = list.stream().filter(n -> n % 2 ==
		 * 0).collect(Collectors.toList());
		 * 
		 * System.out.println(list2);
		 */

		// list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
