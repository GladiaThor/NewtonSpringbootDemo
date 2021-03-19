package com.example.newton.ustube.models.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class UserCreationDto {

    private String name;
    private int age;
    private String password;
    private String email;

}
