package com.example.UserServiceJWT.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserServiceJWT.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
	Role findByName(String name);
}
