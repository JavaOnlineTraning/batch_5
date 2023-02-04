package com.patient.patientservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.patient.patientservice.dto.PatientDTO;
import com.patient.patientservice.entities.PatientEntity;
import com.patient.patientservice.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	// service layer

	@Autowired 
	private PatientRepository patientRepo;

	@Override
	public ResponseEntity<String> addPatientToDB(PatientDTO patientDTO) {

		PatientEntity patientEntity = new PatientEntity();

		patientEntity.setPatientAge(patientDTO.getPatientAge());
		patientEntity.setPatientDisease(patientDTO.getPatientDisease());
		patientEntity.setPatientDOB(patientDTO.getPatientDOB());
		patientEntity.setPatientName(patientDTO.getPatientName());

		patientRepo.saveAndFlush(patientEntity);

		return new ResponseEntity<>("Record Inserted", HttpStatus.OK);
	}

	@Override
	public List<PatientEntity> getAllPatient() {

		//database call to get all patients
		List<PatientEntity> patientList = patientRepo.findAll();
		
		return patientList;
	}
}