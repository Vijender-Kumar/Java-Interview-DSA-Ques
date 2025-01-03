package com.example.interviewPractice.Coding.UserLogin;

public abstract class User {
    String username;
    String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public boolean login(String user, String pass){
        if(this.username.equals(user) && this.password.equals(pass)){
            System.out.println(user+" logged in successfully");
            return true;
        }
        System.out.println(user+" log in failed");
        return false;
    }

    public abstract void postLoginActions();
}
