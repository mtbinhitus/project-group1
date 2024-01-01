package com.example.projectgroup1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "tour_locations")
public class TourLocations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tourLocation_id")
    private Integer tourLocationId;

    @Column(name = "locationType", length = 255, columnDefinition = "VARCHAR(255) DEFAULT 'Point'")
    private String locationType;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "locationAddress", length = 255)
    private String locationAddress;


    @Column(name = "day")
    private Integer day;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public TourLocations(String locationType, Double latitude, Double longitude, String locationAddress, Integer day, Tour tour) {
        this.locationType = locationType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationAddress = locationAddress;
        this.day = day;
        this.tour = tour;
    }

    public TourLocations() {
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
