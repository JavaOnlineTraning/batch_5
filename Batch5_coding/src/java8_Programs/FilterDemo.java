package java8_Programs;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Snehal");
		list.add("Gargi");
		list.add("Ankit");
		list.add("Arjun");

		/*
		 * // Traditional way for (String s : list) { if (s.startsWith("A")) {
		 * System.out.println(s); } }
		 */                 
		   //By using stream API
		   //void test(T t)
		   // t-> System.out.println(t);
			list.stream().filter(t->t.startsWith("A")).forEach(t -> System.out.println(t));

		}
	}
