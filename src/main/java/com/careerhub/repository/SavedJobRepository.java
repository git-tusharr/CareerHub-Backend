package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.SavedJob;

public interface SavedJobRepository extends JpaRepository<SavedJob, Long> {

}