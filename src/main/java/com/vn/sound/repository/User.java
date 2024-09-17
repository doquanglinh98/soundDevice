package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn.sound.model.Microphone;

public interface User extends JpaRepository<User, Long>{
	// find
	Microphone findByUserByID(Long userId);
	List<User> findByUserByName(String userName);
	
	// delete
	void deleteById(Long Id);
	
	// check exits
	Boolean exitsById(Long Id);
}
