package com.microservices.movie.services;

import java.util.List;

// import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.microservices.movie.entities.Movie;

// import org.springframework.beans.factory.annotation.Autowired;

import com.microservices.movie.repositories.MovieRepository;

@Service
public class MovieService {

  private final MovieRepository movieRepository;

  // @Autowired
  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  public List<Movie> getMovies(int page, int size) {
    PageRequest pageable = PageRequest.of(page, size);
    return movieRepository.findAll(pageable).getContent();
  }

  public Movie getMovieById(Long id) {
    return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
  }

  public Movie addMovie(Movie movie) {
    return movieRepository.save(movie);
  }

  public Movie updateMovie(Long id, Movie movie) {
    movie.setId(id);
    return movieRepository.save(movie);
  }

  public String deleteMovie(Long id) {
    movieRepository.deleteById(id);
    return "Movie deleted from database";
  }

}
