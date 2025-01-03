package com.example.interviewPractice.Coding.UserLogin;

public class AdminUser extends User{
    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void postLoginActions() {
        System.out.println("--This is Admin user---");
    }
}
