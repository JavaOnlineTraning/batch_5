package com.student.studententity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Student_Detail")
public class StudentEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int studentId;
private String studentName;
private int studentAge;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
@Override
public String toString() {
	return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ "]";
}

	
	
	

}
 