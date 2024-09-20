package com.vn.sound.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vn.sound.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByUsernameAndPassword(String username, String password);
	Optional<User> findUserByUsernameAndPassword(String username, String password);
}
