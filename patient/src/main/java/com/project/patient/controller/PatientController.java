package com.project.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.patient.model.Donar;
import com.project.patient.model.Patient;
import com.project.patient.service.PatientService;

@RestController
@CrossOrigin(origins = "*")
public class PatientController {
	@Autowired
	private PatientService patientService;
	@PostMapping("/patient/addPatient")
	private Patient registerPatient(@RequestBody Patient patient) {
		return patientService.registerPatient(patient);
	}
	//@JsonIgnoreProperties
	//@JsonIgnore
	@GetMapping("/patient/donars")
	public List<Donar> getAllDonars(){
		return patientService.getAllDonars();
	}
	@GetMapping("/patient/getByaddress/{address}")
	public List<Donar> getByaddress(@PathVariable("address") String address){
		return patientService.getByaddress(address);
		
	}
//	@GetMapping("/patient/bybloodGroup/{bloodGroup}")
//	public List<Donar> getBybloodGroup(@PathVariable("bloodGroup") String bloodGroup){
//		return patientService.getBybloodGroup(bloodGroup);
//	}
	@GetMapping("/patient/getbybloodGroup/{bloodGroup}")
	public List<Donar> getBybloodGroup(@PathVariable("bloodGroup") String bloodGroup){
		return patientService.getBybloodGroup(bloodGroup);
		
	}
}
