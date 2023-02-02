package com.patient.patientservice.service;

import org.springframework.http.ResponseEntity;

import com.patient.patientservice.dto.PatientDTO;

public interface PatientService {

	ResponseEntity<String> addPatientToDB(PatientDTO patientDTO);

}
