package com.vn.sound.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.User;

import jakarta.persistence.Id;

@Repository
public interface UserManger extends JpaRepository<User, Id> {
	// find
	User findById(Long Id);
}
