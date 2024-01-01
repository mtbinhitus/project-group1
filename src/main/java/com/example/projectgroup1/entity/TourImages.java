package com.example.projectgroup1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tour_images")
public class TourImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer imageId;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;


    public TourImages(String image, Tour tour) {
        this.image = image;
        this.tour = tour;
    }

    public TourImages() {
    }

    public String getImage() {
        return image;
    }
}