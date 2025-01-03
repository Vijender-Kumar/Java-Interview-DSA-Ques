package com.example.interviewPractice.InterfaceImplementation.UserLogins;

public class AdminUser extends User{
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void postLoginActions() {
        System.out.println("..Logged in USer is having ADMIN access");
    }
}
