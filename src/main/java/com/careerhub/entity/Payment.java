package com.careerhub.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private Double amount;

    private String currency;

    private String paymentMethod;

    private String transactionId;

    private String paymentStatus;

    private LocalDate paidAt;

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;
}