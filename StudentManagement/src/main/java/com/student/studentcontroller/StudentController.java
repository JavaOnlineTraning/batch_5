package com.student.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentDTO.StudentDTO;
import com.student.studentservice.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping(value = "/addstudent")
	ResponseEntity<String> postStudent(@RequestBody StudentDTO studentDTO) {
		ResponseEntity<String> addStudentToDB = studentService.addStudentToDB(studentDTO);
		return addStudentToDB;

	}

}
