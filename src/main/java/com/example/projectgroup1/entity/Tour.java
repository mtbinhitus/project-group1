package com.example.projectgroup1.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "tour")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "duration")
    private Integer duration;

    @Column(name= "summary")
    private String summary;

    @Column(name ="groupSize")
    private Integer groupSize;

    @Column(name = "ratingAverage")
    private Double ratingAverage;

    @Column(name ="ratingsQuantity")
    private Integer ratingsQuantity;

    @Column(name = "price")
    private Double price;

    @Column(name = "imageCover")
    private String imageCover;

    @Column(name = "images")
    private String images;
    @Column(name = "startDate")
    private String startDate;

    @Column(name = "startLocation")
    private String startLocation;

    @Column(name = "status", columnDefinition = "VARCHAR(255) DEFAULT 'active'")
    private String status;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDate created_at;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<TourGuide> tourGuides;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Review> reviews;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<TourImages> tourImages;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
//    @JsonManagedReference
    private List<TourLocations> tourLocations;

    public Tour(String name, String description, Integer duration,String summary,Integer groupSize ,Double ratingAverage,
                Integer ratingsQuantity,Double price, String imageCover,String startDate, String startLocation) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.summary=summary;
        this.groupSize=groupSize;
        this.ratingAverage = ratingAverage;
        this.ratingsQuantity=ratingsQuantity;
        this.price = price;
        this.imageCover = imageCover;
        this.startDate = startDate;
        this.startLocation = startLocation;
    }

    public Tour() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
