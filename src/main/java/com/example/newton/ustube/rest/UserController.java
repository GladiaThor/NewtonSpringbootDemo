package com.example.newton.ustube.rest;

import com.example.newton.ustube.models.dto.UserCreationDto;
import com.example.newton.ustube.models.entities.User;
import com.example.newton.ustube.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    /**
     * Adds a new user
     * @param user user to add
     * @return the added user
     */
    @PostMapping
    public UserCreationDto addUser(@RequestBody UserCreationDto user){
        return userService.createUser(user);
    }



}
