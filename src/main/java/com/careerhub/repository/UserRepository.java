package com.careerhub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerhub.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
