package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerhub.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}