package com.java.program;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
		Function<Employee,Double> f= e->e.salary+5000;
		Consumer<Employee> consumer =e->System.out.println(e.name + ":" +f.apply(e));
//		Supplier<Employee> s=()-> new Employee("ankush", 30000);
//		Employee employee = s.get(salary);
//		System.out.println(employee);

		for (Employee e1 : arrayList) {
			 if (p1.test(e1))
			//if (p2.test(e1)) {
				{
				 
					consumer.accept(e1);
				}

			}

		}

	}


