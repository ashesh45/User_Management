package com.ashesh45.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashesh45.model.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls, Integer>{
	

}
