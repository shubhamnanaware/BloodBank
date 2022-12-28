package com.project.donationCamp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.donationCamp.model.Doantion;
@Repository
public interface DonationRepo extends JpaRepository<Doantion, Integer> {

}
