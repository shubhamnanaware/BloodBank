package com.project.donar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.donar.model.Donar;
import com.project.donar.repository.DonarRepo;

@Service
public class DonarService {
	@Autowired
	private DonarRepo donarRepo;

	public Donar saveDonar(Donar donar) {
		return donarRepo.save(donar);
	}

	public List<Donar> getAllDonar() {
		return donarRepo.findAll();
	}
	public String updateDonar(int id,Donar donar) {
		if(donarRepo.existsById(id)) {
			donar.setId(id);
			//Optional<Donar> d1 =donarRepo.findById(id);
	donarRepo.save(donar);
		//	donarRepo.save();
			return "record updated successfully";
		}
		else
			return "donar not exist";
		
	}
	public String deleterDonar(int id,Donar donar) {
		if(donarRepo.existsById(id)) {
			donar.setId(id);
			donarRepo.deleteById(id);
			return"donar record Deleted";
		}
		else
		return "donar not exist";
	}
	public List<Donar> getByaddress(String address){
		return donarRepo.getByaddress(address);
	}
	public List<Donar> getBybloodGroup(String bloodGroup){
		return donarRepo.getBybloodGroup(bloodGroup);
	}
	public List<Donar> getByAddressandBloodGroup(Donar donar){
		System.out.println(donar.getAddress());
		System.out.println(donar.getBloodGroup());
		return donarRepo.findByAddressAndBloodGroup(donar.getAddress(),donar.getBloodGroup());
	}
	
}
