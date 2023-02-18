package com.student.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.studentDTO.StudentDTO;
import com.student.studententity.StudentEntity;
import com.student.studentrepository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public ResponseEntity<String> addStudentToDB(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		
		StudentEntity entity=new StudentEntity();
		entity.setStudentName(studentDTO.getStudentFullName());
		entity.setStudentAge(studentDTO.getStudentCurrentAge());
		
		studentRepo.saveAndFlush(entity);
		
		return new ResponseEntity<>("Record Inseretd SuccessFully",HttpStatus.OK);
	}

}
