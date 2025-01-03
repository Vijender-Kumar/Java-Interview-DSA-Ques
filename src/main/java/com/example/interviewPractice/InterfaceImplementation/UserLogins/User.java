package com.example.interviewPractice.InterfaceImplementation.UserLogins;

public abstract class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println(username+" logged in successfully");
            return true;
        }
        System.out.println(username + " failed to log in to the System");
        return false;
    }
    public abstract void postLoginActions();
}
