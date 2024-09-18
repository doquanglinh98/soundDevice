package com.vn.sound.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.User;

@Repository
public interface UserMangerRepository extends JpaRepository<User, Long> {
	// find
	Optional<User> findById(Long Id);

	boolean existsByUsernameAndPassword(String username, String password);
}
