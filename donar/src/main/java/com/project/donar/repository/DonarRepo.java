package com.project.donar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.donar.model.Donar;
@Repository
public interface DonarRepo extends JpaRepository<Donar, Integer> {

	public List<Donar> getByaddress(String address);
	
	public List<Donar> getBybloodGroup(String bloodGroup);

	//void deleteById(Donar donar);
	public List<Donar> findByAddressAndBloodGroup(String address,String bloodGroup);
	

}
