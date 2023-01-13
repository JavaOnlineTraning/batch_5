package com.javaEightFeature;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;
	String gender;

	public Employee(String name, int salary, String gender) {
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

}

public class FunctionalInterExample {

	public static void main(String[] args) {

		ArrayList<Employee> a = new ArrayList<>();

		a.add(new Employee("Ram", 50000, "Male"));
		a.add(new Employee("Shyam", 30000, "Male"));
		a.add(new Employee("Raghu", 20000, "Male"));
		a.add(new Employee("Amit", 90000, "Male"));

		// task 1
		Function<Employee, Integer> f = emp -> (emp.salary * 10) / 100;

		// task2
		Predicate<Integer> p = i -> i >= 5000;

		// task3
		Consumer<Employee> c = e -> {
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println(e.gender);
		};

		for (Employee e : a) {
			Integer bonus = f.apply(e);

			if (p.test(bonus)) {
				c.accept(e);
				// System.out.println(bonus);
			}

		}

	}

}
