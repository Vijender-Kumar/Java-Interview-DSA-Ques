package com.example.interviewPractice.mphasisInterview;

import lombok.Builder;
import lombok.Data;

import java.util.*;

public class userGroup {

    @Data
    @Builder
    public static class Group{
        User user;
        int groupId;
    }

    @Data
    @Builder
    public static class User{
        int empId;
        String name;
    }

    public static void main(String[] args){
        List<Group> groupList = new ArrayList<>();
        Group g1 = Group.builder()
                .groupId(1001)
                .user(User.builder()
                        .empId(101)
                        .name("Vijender")
                        .build())
                .build();
        Group g2 = new Group(new User(102, "Viju"), 1002);
        groupList.add(g1);
        groupList.add(g2);
        for(Group g:groupList){
            System.out.println(g.user.empId +","+g.user.name+","+g.groupId);
        }
    }
}
