package com.basic;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String a[] = new String[10];

		System.out.println(Arrays.toString(arr));

		for (int i : arr) {

			System.out.println(i + 1);

		}

	}
}