package com.student.studentDTO;

public class StudentDTO {

	private int studentId;
	private String studentFullName;
	private int studentCurrentAge;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public int getStudentCurrentAge() {
		return studentCurrentAge;
	}
	public void setStudentCurrentAge(int studentCurrentAge) {
		this.studentCurrentAge = studentCurrentAge;
	}
	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentFullName=" + studentFullName + ", studentCurrentAge="
				+ studentCurrentAge + "]";
	}	
	
	
	
}
