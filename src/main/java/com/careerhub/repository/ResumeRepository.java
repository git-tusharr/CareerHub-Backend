package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}