package com.example.interviewPractice.mphasisInterview.aPracticeRestart;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class userObj {
    @Data
    @Builder
    public static class Address{
        String address;
        long pincode;
    }

    @Data
    @Builder
    public static class User{
        String name;
        Address address;
        int empId;
    }

    public static void main(String[] args){
        List<User> userList = new ArrayList<>();
        User user1 = new User("Vijender", new Address("Gopal Nagar", 110043), 1001);
        userList.add(user1);
        User user = User.builder()
                .name("VIJENDER")
                .address(Address.builder()
                        .address("GOPAL NAGAR")
                        .pincode(110042)
                        .build())
                .empId(1010)
                .build();
        userList.add(user);
        System.out.println(userList);
    }
}
