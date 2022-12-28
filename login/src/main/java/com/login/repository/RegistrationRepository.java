package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {


	public User findByUsernameAndPassword(String username, String password);


}
