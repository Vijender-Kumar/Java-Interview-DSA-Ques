package com.example.interviewPractice.other.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class mainPayService {

    private final PaymentService paymentService;

    // Use @Qualifier to specify which implementation to inject
    @Autowired
    public mainPayService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String getService() {
        paymentService.payment(23.2);
        return "In Main Service";
    }
}
