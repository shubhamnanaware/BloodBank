package com.project.donationCamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.donationCamp.model.Doantion;
import com.project.donationCamp.service.DonationService;

@RestController
@CrossOrigin(origins = "*")
public class DonationController {
	@Autowired
	private DonationService donationService;
	@PostMapping("/donation/saveDonation")
	public Doantion saveCamp(@RequestBody Doantion doantion) {
		return donationService.saveCamp(doantion);
	}
	@GetMapping("/donation/detailsCamps")
	public List<Doantion> getCampDetils(){
		return donationService.getCampDetils();
	}
}
