package com.microservices.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.movie.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
