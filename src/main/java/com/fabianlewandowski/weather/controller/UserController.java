package com.fabianlewandowski.weather.controller;

import com.fabianlewandowski.weather.model.User;
import com.fabianlewandowski.weather.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    private final UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }
}
