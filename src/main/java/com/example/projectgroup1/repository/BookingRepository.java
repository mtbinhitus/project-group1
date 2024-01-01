package com.example.projectgroup1.repository;

import com.example.projectgroup1.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
