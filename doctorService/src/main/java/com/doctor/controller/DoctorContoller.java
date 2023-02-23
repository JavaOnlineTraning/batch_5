package com.doctor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorContoller {

	@GetMapping(value="/doctorapi")
	public String getDoctor(){
		return "this is doctor service";
	}
	
	
	
	
	
}
