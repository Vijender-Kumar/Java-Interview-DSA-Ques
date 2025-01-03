package com.example.interviewPractice.Coding.API.Repo;

import com.example.interviewPractice.Coding.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
