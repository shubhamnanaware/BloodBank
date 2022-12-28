package com.project.patient;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import com.project.donar.model.Donar;
//import com.project.donar.repository.DonarRepo;
import com.project.patient.model.Patient;
import com.project.patient.repository.PatientRepo;

@SpringBootTest
class PatientApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private PatientRepo patientRepo;
	@Test
	public void testReadAll() {
		List list = patientRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void savePatientTest() {
		Patient patient = new Patient(12,"kumar","kumar@gmail.com","mumbai",98098063);
		patientRepo.save(patient);
		assertThat(patient.getPatientName()).isEqualTo("kumar");
	}
}
