package com.careerhub.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    // Find company by company name
    Optional<Company> findByCompanyName(String companyName);

    // Find companies by industry
    List<Company> findByIndustry(String industry);

    // Find companies by tenant ID (for multi-tenant SaaS)
    List<Company> findByTenantId(Long tenantId);

}