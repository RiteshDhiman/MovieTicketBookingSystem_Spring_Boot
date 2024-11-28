package com.microservices.movie.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.movie.entities.Showtime;

public interface ShowtimeRepository extends JpaRepository<Showtime, Long>{
  List<Showtime> findByMovieId(Long movieId);
}
