package com.example.interviewPractice.other.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PhonePayService implements PaymentService {
    @Override
    public void payment(double amount) {
        System.out.println("This is PhonePay Service");
    }
}
