package com.vn.sound.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.sound.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean isAdmin(String username, String password) {
		if (userRepository.existsByUsernameAndPassword(username, password)) {
			return true;
		}
		return false;
	}
}
