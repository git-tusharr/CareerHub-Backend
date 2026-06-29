package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}