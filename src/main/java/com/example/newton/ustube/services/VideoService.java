package com.example.newton.ustube.services;

import com.example.newton.ustube.models.dto.VideoCreationDto;
import com.example.newton.ustube.models.entities.Video;
import com.example.newton.ustube.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VideoService {

    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video addVideo(VideoCreationDto videoCreationDto){
        var createdVideo = new Video(videoCreationDto);
        videoRepository.save(createdVideo);
        return createdVideo;
    }
}
