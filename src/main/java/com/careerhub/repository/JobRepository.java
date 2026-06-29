package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerhub.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
