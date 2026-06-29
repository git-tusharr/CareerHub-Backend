package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long> {

}