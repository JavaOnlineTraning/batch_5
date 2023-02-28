package com.java.program;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class predexmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee("akash", 20000));
		arrayList.add(new Employee("pawan", 10000));
		arrayList.add(new Employee("shubham", 50000));
		arrayList.add(new Employee("aniket", 40000));
		arrayList.add(new Employee("manish", 35000));
		arrayList.add(new Employee("rushi", 76000));

		Predicate<Employee> p1 = e -> e.salary > 10000;
		 //Predicate<Employee> p2 = e -> e.name.length()>4;

		for (Employee e1 : arrayList) {
			 if (p1.negate().test(e1))
			//if (p2.test(e1)) {
				{
					System.out.println(e1.name + ":" + e1.salary);
				}

			}

		}

	}

