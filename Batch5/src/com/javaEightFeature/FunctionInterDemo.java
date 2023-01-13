package com.javaEightFeature;

import java.util.function.Function;

public class FunctionInterDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		Integer apply = f.apply(4);
		System.out.println(apply);

		System.out.println(f.apply(12));

		Function<String, Integer> f1 = s -> s.length();

		System.out.println(f1.apply("java"));

	}

}
