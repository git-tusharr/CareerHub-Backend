package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}