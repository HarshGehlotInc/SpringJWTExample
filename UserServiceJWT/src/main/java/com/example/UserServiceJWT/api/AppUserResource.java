package com.example.UserServiceJWT.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserServiceJWT.domain.AppUser;
import com.example.UserServiceJWT.service.AppUserService;

@RestController
@RequestMapping("/api")
public class AppUserResource {
	
	@Autowired
	private AppUserService appUserService;
	
	@GetMapping("/users")
	public ResponseEntity<List<AppUser>> getUsers(){
		return ResponseEntity.ok().body(appUserService.getUsers());
	}
}
