package com.basic;

public class Student {

	int rollNo;
	String name;
	static String clgName = "KGIET";

	

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}



	public static void main(String[] args) {

		Student s1 = new Student(101, "Swapnil");
		Student s2 = new Student(102, "Shiv");
		Student s3 = new Student(103, "Shiv");
		Student s4 = new Student(104, "Shiv");
		Student s5 = new Student(105, "Shiv");
		Student s6 = new Student(106, "Shiv");
		Student s7 = new Student(107, "Shiv");
		Student s8 = new Student(108, "Shiv");
		Student s9 = new Student(109, "Shiv");
		System.out.println(s1.name + " " + s1.rollNo + " "+s1.clgName);
		System.out.println(s2.name + " " + s2.rollNo + " "+s2.clgName);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s3);
	}
}
