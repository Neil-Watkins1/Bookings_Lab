package com.codeclan.example.courseBooker.controllers;


import com.codeclan.example.courseBooker.models.Booking;
import com.codeclan.example.courseBooker.repositories.bookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> getAllBookings(){return bookingRepository.findAll();}

    @GetMapping(value = "/{date}")
    public List<Booking> findAllBookingsByDate(@PathVariable String date){
        return bookingRepository.findAllBookingsByDate(date);
    }
}

