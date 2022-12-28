package com.project.donationCamp.model;

import java.util.Date;

//import org.hibernate.annotations.TimeZoneColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Doantion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donationCampId;
	private String location;
	
	private Date date;
	public int getDonationCampId() {
		return donationCampId;
	}
	public void setDonationCampId(int donationCampId) {
		this.donationCampId = donationCampId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Doantion(int donationCampId, String location, Date date) {
		super();
		this.donationCampId = donationCampId;
		this.location = location;
		this.date = date;
	}
	public Doantion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Doantion [donationCampId=" + donationCampId + ", location=" + location + ", date=" + date + "]";
	}
	
	

}
