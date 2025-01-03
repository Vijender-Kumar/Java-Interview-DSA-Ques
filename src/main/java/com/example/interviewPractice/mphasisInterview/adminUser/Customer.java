package com.example.interviewPractice.mphasisInterview.adminUser;

public class Customer extends User{
    Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void postLoginActions() {
        System.out.println("...........Customer is exploring options to buy..........");
    }
}
