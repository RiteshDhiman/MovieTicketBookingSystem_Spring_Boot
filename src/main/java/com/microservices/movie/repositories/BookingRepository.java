package com.microservices.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.movie.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
