package com.codeclan.example.courseBooker.repositories.bookingRepository;

import com.codeclan.example.courseBooker.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> findAllBookingsByDate(String date);
}
