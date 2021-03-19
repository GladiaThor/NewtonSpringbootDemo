package com.example.newton.ustube.repositories;

import com.example.newton.ustube.models.entities.Video;
import org.springframework.data.repository.CrudRepository;

public interface VideoRepository extends CrudRepository<Video, String> {
}
