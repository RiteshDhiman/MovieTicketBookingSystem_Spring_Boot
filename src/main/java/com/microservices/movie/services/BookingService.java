package com.microservices.movie.services;

import org.springframework.stereotype.Service;

import com.microservices.movie.entities.Booking;
import com.microservices.movie.entities.Showtime;
import com.microservices.movie.entities.User;
import com.microservices.movie.repositories.BookingRepository;
import com.microservices.movie.repositories.ShowtimeRepository;
import com.microservices.movie.repositories.UserRepository;

@Service
public class BookingService {

  private final BookingRepository bookingRepository;
  private final UserRepository userRepository;
  private final ShowtimeRepository showtimeRepository;

  public BookingService(BookingRepository bookingRepository,
      UserRepository userRepository,
      ShowtimeRepository showtimeRepository) {
    this.bookingRepository = bookingRepository;
    this.userRepository = userRepository;
    this.showtimeRepository = showtimeRepository;
  }

  // public Booking bookTicket(BookingRequest bookingRequest) {
  //   User user = userRepository.findById(bookingRequest.getUserId())
  //       .orElseThrow(() -> new RuntimeException("User not found"));

  //   Showtime showtime = showtimeRepository.findById(bookingRequest.getShowtimeId())
  //       .orElseThrow(() -> new RuntimeException("Showtime not found"));

  //   // Assuming the logic to reduce available seats is handled elsewhere.
  //   Booking booking = new Booking();
  //   booking.setUser(user);
  //   booking.setShowtime(showtime);
  //   booking.setSeatsBooked(bookingRequest.getSeats());
  //   return bookingRepository.save(booking);
  // }
}
