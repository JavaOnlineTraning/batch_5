package com.patient.patientservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.patient.patientservice.entities.PatientEntity;
import com.patient.patientservice.repository.PatientRepository;
import com.patient.patientservice.service.PatientServiceImpl;

@SpringBootTest(classes = { PatientServiceImplTest.class })
public class PatientServiceImplTest {

	@Mock
	PatientRepository repository;

	@InjectMocks
	PatientServiceImpl patientServiceImpl;

	@Test
	// @Order(10)
	public void testGetAllPatient() {

		List<PatientEntity> list = new ArrayList<PatientEntity>();
		list.add(new PatientEntity(101, "ABC", "Cold", new Date(0), 12));
		list.add(new PatientEntity(101, "LMN", "Cold", new Date(0), 12));

		when(repository.findAll()).thenReturn(list);
		List<PatientEntity> allPatient = patientServiceImpl.getAllPatient();

		assertEquals(2, allPatient.size());
	}

}
