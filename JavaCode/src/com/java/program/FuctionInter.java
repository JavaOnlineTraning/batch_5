package com.java.program;

import java.util.function.Consumer;
import java.util.function.Function;

class Student{
	String nameString;
	int  marks;
	public Student(String nameString, int marks) {
		super();
		this.nameString = nameString;
		this.marks = marks;
	}
}



public class FuctionInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Student,String> f= s->{
int	studentmark=s.marks;
String grade ="";
if (studentmark>80) grade="A+[Distiction]";
else if(studentmark>70) grade="A [first class]";
else if(studentmark>60) grade="B [second class]";
else if(studentmark>50) grade="c [third class]";
else if(studentmark<40) grade="d [fail]";
return grade;
};
//Predicate<Student> p =s->s.marks>60;
Consumer<Student> consumer=s1->{
	
	System.out.println("student name : "+s1.nameString);
	System.out.println("student mark : "+s1.marks);
	System.out.println("student grade : "+f.apply(s1));
	System.out.println();
};
Student[] s = { new Student("pradeep",80),
		new Student("akshay",75),
		new Student("anita",65),
		new Student("gargi",55),
		new Student("ankit",35),
			
};
//		for(Student s1:s) {
//			if(p.test(s1)) {
//		System.out.println("student name : "+s1.nameString);
//		System.out.println("student mark : "+s1.marks);
//		System.out.println("student grade : "+f.apply(s1));
//		System.out.println();
//			}
//		
          for(Student s3:s) {
        	//if ( p.test(s3))
        	  {
            consumer.accept(s3);
        	  }
		}
		
	}

}
