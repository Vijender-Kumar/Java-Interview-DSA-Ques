package com.example.interviewPractice.mphasisInterview.adminUser;

public class Admin extends User{
    Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void postLoginActions() {
        System.out.println("*****Admin is checking the overall sale done***");
    }
}
