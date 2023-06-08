package com.example.ls14.entity;

import jdk.jfr.events.CertificateId;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class SagaData {
    @Id
    @GeneratedValue(strategy = GenerationType.Identity)
    private long id;
    private final long customerId;
    private final Long orderId;
    private OrderDetails orderDetails;

}
