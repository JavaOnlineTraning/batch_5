package com.patient.patientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.patientservice.entities.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, String> {

}
