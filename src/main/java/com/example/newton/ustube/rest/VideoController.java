package com.example.newton.ustube.rest;

import com.example.newton.ustube.models.dto.VideoCreationDto;
import com.example.newton.ustube.models.entities.Video;
import com.example.newton.ustube.repositories.VideoRepository;
import com.example.newton.ustube.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {

    //TODO: Error handling
    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @PostMapping
    public Video uploadVideo(@RequestBody VideoCreationDto video){
        return videoService.addVideo(video);
    }

}
