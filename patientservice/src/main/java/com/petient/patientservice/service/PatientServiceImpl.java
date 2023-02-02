package com.petient.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.petient.patientservice.dto.PatientDTO;
import com.petient.patientservice.entities.PatientEntity;
import com.petient.patientservice.repo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {
	// service layer

	@Autowired
	private PatientRepo patientRepo;

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

}
