package com.example.UserServiceJWT.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.UserServiceJWT.domain.AppUser;
import com.example.UserServiceJWT.domain.Role;
import com.example.UserServiceJWT.repo.AppUserRepo;
import com.example.UserServiceJWT.repo.RoleRepo;

import lombok.extern.slf4j.Slf4j;
@Service
@Transactional
@Slf4j
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private AppUserRepo appUserRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Override
	public AppUser saveUser(AppUser user) {
		return appUserRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepo.save(role);
	}

	@Override
	public void addRoletoUser(String username, String roleName) {
		AppUser appUser = appUserRepo.findByUsername(username); 
		Role role = roleRepo.findByName(roleName);
		// Add role to Arraylist 
		appUser.getRoles().add(role);            
	}

	@Override
	public AppUser getUser(String username) {

		return appUserRepo.findByUsername(username);
	} 

	@Override
	public List<AppUser> getUsers() {
		return appUserRepo.findAll();
	}
	
}
