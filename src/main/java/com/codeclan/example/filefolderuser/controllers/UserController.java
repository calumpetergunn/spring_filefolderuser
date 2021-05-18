package com.codeclan.example.filefolderuser.controllers;

import com.codeclan.example.filefolderuser.models.File;
import com.codeclan.example.filefolderuser.models.User;
import com.codeclan.example.filefolderuser.repositories.FileRepository;
import com.codeclan.example.filefolderuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value="/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user){
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }
}
