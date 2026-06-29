package com.careerhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}