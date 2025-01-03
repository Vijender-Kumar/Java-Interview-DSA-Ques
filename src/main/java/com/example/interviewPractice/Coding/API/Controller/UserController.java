package com.example.interviewPractice.Coding.API.Controller;

import com.example.interviewPractice.Coding.API.Model.User;
import com.example.interviewPractice.Coding.API.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<User>(userRepo.save(user), HttpStatus.CREATED);
    }

}
