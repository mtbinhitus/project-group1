package com.example.projectgroup1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", nullable = false, length = 255, unique = true)
    private String username;

    @Column(name = "email", nullable = false, length = 255, unique = true)
    private String email;

    @Column(name = "photo", length = 255, nullable = true)
    private String photo;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", columnDefinition = "ENUM('user', 'guide', 'lead-guide', 'admin') DEFAULT 'user'")
    private UserRole role;

    @CreationTimestamp
    @Column(name = "created_at", nullable = true)
    private LocalDate created_at;


//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "user_tour",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "tour_id"))
//    private List<Tour> tours = new ArrayList<>();

    public User() {
    }

    public User(String username, String email, String photo, String password, UserRole role) {
        this.username = username;
        this.email = email;
        this.photo = photo;
        this.password = password;
        this.role = role;
    }

    public enum UserRole {
        user, guide, lead_guide, admin
    }
}
