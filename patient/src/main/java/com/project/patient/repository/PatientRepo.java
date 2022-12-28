package com.project.patient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.patient.model.Donar;
//import com.project.donar.model.Donar;
import com.project.patient.model.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

	//public List<Donar> getByaddress(String address);
	//public List<Donar> getBybloodGroup(String bloodGroup);

}
