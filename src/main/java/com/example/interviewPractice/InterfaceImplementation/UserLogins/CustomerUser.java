package com.example.interviewPractice.InterfaceImplementation.UserLogins;

public class CustomerUser extends User{
    CustomerUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void postLoginActions() {
        System.out.println("---Logged in user is having Customer access---");
    }
}
