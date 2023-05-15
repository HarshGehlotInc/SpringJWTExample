package com.example.UserServiceJWT.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserServiceJWT.domain.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Long>{
	AppUser findByUsername(String username);
}
