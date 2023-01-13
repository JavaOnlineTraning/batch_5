package com.javaEightFeature;

import java.util.function.Predicate;

public class DemoLambdaExpression {

	public static void main(String[] args) {
		
		int b;

		Predicate<Integer> p = i -> (i > 10);

		System.out.println(p.test(8));
		System.out.println(p.test(12));

		Predicate<String> s = s1 -> (s1.length() > 5);

		System.out.println(s.test("Welcome"));

		int a[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;

		for (int n : a) {
			if (p1.or(p2).test(n)) {
				System.out.println(n);

			}
		}

	}

}
