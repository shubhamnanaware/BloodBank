package com.project.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.patient.model.Donar;
import com.project.patient.model.Patient;
import com.project.patient.repository.PatientRepo;

@Service
public class PatientService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private PatientRepo patientRepo;
	
	
	
	public Patient registerPatient(Patient patient) {
		return patientRepo.save(patient);
	}
	
	public List<Donar> getAllDonars(){
		//return null;
		//String  pro = run(()->restTemplate.);
		List<Donar> d = restTemplate.getForObject("http://localhost:8883/donar/donars",List.class);
		//System.out.println(d);
		return d;
		
	}
	public List<Donar> getByaddress(String address){
		List<Donar> d =  restTemplate.getForObject("http://localhost:8883/donar/byaddress/"+address,List.class);
		return d;
		
		
	}
//	public List<Donar> getBybloodGroup(String bloodGroup){
//		List<Donar> d = restTemplate.getForObject("http://localhost:8883/donar/bybloodGroup/"+bloodGroup,List.class);;
//		return d;
//	
//	}
	public List<Donar> getBybloodGroup(String bloodGroup){
		List<Donar> b = restTemplate.getForObject("http://localhost:8883/donar/bybloodGroup/"+bloodGroup,List.class);
	return b;
	}
}
