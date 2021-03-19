package com.example.newton.ustube.models.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Embeddable
@Getter
@Setter
public class ContentMeta {

    private int likes;
    private int dislikes;

    @OneToMany
    private List<Comment> responses;

    @ManyToOne(optional = false)
    private User poster;

}
