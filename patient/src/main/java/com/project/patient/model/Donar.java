package com.project.patient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;


public class Donar {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private int id;
	private String name;
	private String gender;
	private int age;
	private String bloodGroup;
	private String email;
	private String address;
	private int mobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Donar(int id, String name, String gender, int age, String bloodGroup, String email, String address,
			int mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.email = email;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	public Donar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Donar [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", bloodGroup="
				+ bloodGroup + ", email=" + email + ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}
	
	

}
