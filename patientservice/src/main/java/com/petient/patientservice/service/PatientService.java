package com.petient.patientservice.service;

import org.springframework.http.ResponseEntity;

import com.petient.patientservice.dto.PatientDTO;

public interface PatientService {

	ResponseEntity<String> addPatientToDB(PatientDTO patientDTO);

}
