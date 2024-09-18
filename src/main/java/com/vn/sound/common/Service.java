package com.vn.sound.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.vn.sound.repository.UserMangerRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private UserMangerRepository userMangerRepo;

	public Boolean isAdmin(String uName, String pwd) {
		System.out.println("uName=" + uName + ", pwd=" + pwd);
		if (userMangerRepo.existsByUsernameAndPassword(uName, pwd)) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
