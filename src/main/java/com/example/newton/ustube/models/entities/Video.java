package com.example.newton.ustube.models.entities;

import com.example.newton.ustube.models.dto.VideoCreationDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Video {

    public Video(VideoCreationDto videoCreationDto) {
        this.title = videoCreationDto.getTitle();
        this.description = videoCreationDto.getDescription();
        this.contentMeta = new ContentMeta();
        this.videoUrl = videoCreationDto.getVideoUrl();
        contentMeta.setPoster(new User(videoCreationDto.getPosterId()));
    }

    @Id
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid2")
    @Column(length = 64)
    private String id;

    @Embedded
    private ContentMeta contentMeta;

    private String title;
    private String description;
    private String videoUrl;


}
