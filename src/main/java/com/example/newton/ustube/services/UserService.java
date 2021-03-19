package com.example.newton.ustube.services;

import com.example.newton.ustube.models.dto.UserCreationDto;
import com.example.newton.ustube.models.entities.User;
import com.example.newton.ustube.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private boolean isEmailUnique(String email){
        return userRepository.getUserByEmail(email).isEmpty();
    }

    public UserCreationDto createUser(UserCreationDto userCreationDto){
        if(isEmailUnique(userCreationDto.getEmail())){
            User createdUser = new User(userCreationDto);
            userRepository.save(createdUser);
        } else {
            throw new RuntimeException("User with email already exists");
        }
        return userCreationDto;
    }

}
