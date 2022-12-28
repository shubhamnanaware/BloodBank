package com.project.donationCamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.donationCamp.model.Doantion;
import com.project.donationCamp.repo.DonationRepo;

@Service
public class DonationService {
	@Autowired
	private DonationRepo donationRepo;
	
	public Doantion saveCamp(Doantion donation) {
		return donationRepo.save(donation);
	}
	public List<Doantion> getCampDetils(){
		return donationRepo.findAll();
	}

}
