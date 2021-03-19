package com.example.newton.ustube.models.entities;

import com.example.newton.ustube.models.dto.UserCreationDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    public User(String id) {
        this.id = id;
    }

    public User(UserCreationDto user) {
        this.age = user.getAge();
        this.email = user.getEmail();
        this.name = user.getName();
        this.userCredentials = new UserCredentials();
        this.userCredentials.setPassword(user.getPassword());
    }

    @Id
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid2")
    @Column(length = 64)
    private String id;

    @OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private UserCredentials userCredentials;

    @OneToMany(mappedBy = "contentMeta.poster")
    private List<Comment> comments;

    @OneToMany(mappedBy = "contentMeta.poster")
    private List<Video> videos;

    private String name;
    private int age;
    private String email;



}
