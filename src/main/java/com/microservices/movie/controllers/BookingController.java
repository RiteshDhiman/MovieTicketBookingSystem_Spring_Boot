package com.microservices.movie.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.movie.entities.Booking;
import com.microservices.movie.services.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // @PostMapping
    // public ResponseEntity<Booking> bookTicket(@RequestBody BookingRequest bookingRequest) {
    //     Booking booking = bookingService.bookTicket(bookingRequest);
    //     return ResponseEntity.ok(booking);
    // }
}
