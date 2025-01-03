package com.example.interviewPractice.mphasisInterview.adminUser;

public abstract class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println(username+" logged in successfully.........");
            return true;
        }
        System.out.println(username+" log in failed***********");
        return false;
    }

    public abstract void postLoginActions();
}
