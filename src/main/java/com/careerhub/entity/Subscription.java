package com.careerhub.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subscriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;

    private String planName;

    private Double price;

    private LocalDate startDate;

    private LocalDate endDate;

    private String subscriptionStatus;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;
}