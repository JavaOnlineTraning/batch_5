package com.petient.patientservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petient.patientservice.entities.PatientEntity;

@Repository
public interface PatientRepo extends JpaRepository<PatientEntity, String> {
	//repository layer
}
