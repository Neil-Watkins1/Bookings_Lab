package com.codeclan.example.courseBooker.repositories.bookingRepository;

import com.codeclan.example.courseBooker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingRepository extends JpaRepository<Booking, Long> {
}
