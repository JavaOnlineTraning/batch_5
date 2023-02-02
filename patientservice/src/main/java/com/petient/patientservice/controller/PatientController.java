package com.petient.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petient.patientservice.dto.PatientDTO;
import com.petient.patientservice.service.PatientService;

@RestController
public class PatientController {
	// Controller layer

	@Autowired
	private PatientService patientService;

	// handler method
	@PostMapping(value = "/addPatient")
	public ResponseEntity<String> addPatientToDB(@RequestBody PatientDTO patientDTO) {
		ResponseEntity<String> responseEntity = patientService.addPatientToDB(patientDTO);
		return responseEntity;

	}

}
