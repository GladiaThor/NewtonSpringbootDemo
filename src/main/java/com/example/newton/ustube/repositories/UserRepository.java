package com.example.newton.ustube.repositories;

import com.example.newton.ustube.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    public Optional<User> getUserByEmail(String email);
}
