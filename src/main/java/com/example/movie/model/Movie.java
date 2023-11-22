package com.example.movie.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "movie")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RATING")
    private Float rating;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATE_AT")
    private LocalDateTime updatedAt;

}
