package com.microservices.movie.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.movie.entities.Movie;
import com.microservices.movie.entities.Showtime;
import com.microservices.movie.repositories.MovieRepository;
import com.microservices.movie.repositories.ShowtimeRepository;

@Service
public class ShowtimeService {

  private final ShowtimeRepository showtimeRepository;
  private final MovieRepository movieRepository;

  public ShowtimeService(ShowtimeRepository showtimeRepository, MovieRepository movieRepository) {
    this.showtimeRepository = showtimeRepository;
    this.movieRepository = movieRepository;
  }

  public List<Showtime> getShowtimesByMovieId(Long movieId) {
    movieRepository.findById(movieId).orElseThrow(() -> new RuntimeException("Movie not found"));
    return showtimeRepository.findByMovieId(movieId);
  }

  public Showtime addShowtime(Long movieId, Showtime showtime) {
    Movie movie = movieRepository.findById(movieId)
        .orElseThrow(() -> new RuntimeException("Movie not found"));

    showtime.setMovie(movie);
    return showtimeRepository.save(showtime);
  }
}
