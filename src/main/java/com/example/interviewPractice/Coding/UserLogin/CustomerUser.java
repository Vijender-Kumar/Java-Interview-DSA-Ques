package com.example.interviewPractice.Coding.UserLogin;

public class CustomerUser extends User{
    public CustomerUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void postLoginActions() {
        System.out.println("*****this is Customer USER*****");
    }
}
