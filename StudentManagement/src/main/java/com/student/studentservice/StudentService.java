package com.student.studentservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.studentDTO.StudentDTO;

@Service
public interface StudentService {

	ResponseEntity<String> addStudentToDB(StudentDTO studentDTO);
	
	
	
}
