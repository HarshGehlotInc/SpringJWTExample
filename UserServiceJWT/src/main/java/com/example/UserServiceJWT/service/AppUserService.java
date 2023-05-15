package com.example.UserServiceJWT.service;

import java.util.List;

import com.example.UserServiceJWT.domain.AppUser;
import com.example.UserServiceJWT.domain.Role;

public interface AppUserService {
	AppUser saveUser(AppUser user);
	Role saveRole(Role role);
	void addRoletoUser(String username, String roleName);
	AppUser getUser(String username);
	List<AppUser>getUsers(); // don't use it in real WorldApplication
}
