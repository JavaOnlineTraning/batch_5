package com.patient.patientservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.patientservice.dto.PatientDTO;
import com.patient.patientservice.entities.PatientEntity;
import com.patient.patientservice.service.PatientService;

@RestController
public class PatientController {
	// Controller layer

	@Autowired // create an object and inject it where it is required
	private PatientService patientService;

	// handler method to add patient in database
	@PostMapping(value = "/addPatient")
	public ResponseEntity<String> addPatientToDB(@RequestBody PatientDTO patientDTO) {
		ResponseEntity<String> responseEntity = patientService.addPatientToDB(patientDTO);
		return responseEntity;

	}

	// get all patients
	@GetMapping(value = "/patient")
	public ResponseEntity<List<PatientEntity>> getAllPatient() {
		List<PatientEntity> patientList = patientService.getAllPatient();
		// returning responseEntity obj as body
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(patientList);
	}

}