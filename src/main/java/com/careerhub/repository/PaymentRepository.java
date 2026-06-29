package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}