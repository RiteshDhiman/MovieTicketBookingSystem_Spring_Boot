package com.microservices.movie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.movie.entities.Showtime;
import com.microservices.movie.services.ShowtimeService;

@RestController
@RequestMapping("/api/movies/{movieId}/showtimes")
public class ShowtimeController {

    private final ShowtimeService showtimeService;

    public ShowtimeController(ShowtimeService showtimeService) {
        this.showtimeService = showtimeService;
    }

    @GetMapping
    public List<Showtime> getShowtimes(@PathVariable Long movieId) {
        return showtimeService.getShowtimesByMovieId(movieId);
    }

    @PostMapping
    public Showtime addShowtime(@PathVariable Long movieId, @RequestBody Showtime showtime) {
        return showtimeService.addShowtime(movieId, showtime);
    }
}
