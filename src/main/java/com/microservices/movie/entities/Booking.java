package com.microservices.movie.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @ManyToOne
    @JoinColumn(name = "showtime_id", nullable = false)
    private Showtime showtime;

  public Showtime getShowtime() {
    return showtime;
  }

  public void setShowtime(Showtime showtime) {
    this.showtime = showtime;
  }

  private int seatsBooked;

  public int getSeatsBooked() {
    return seatsBooked;
  }

  public void setSeatsBooked(int seatsBooked) {
    this.seatsBooked = seatsBooked;
  }
    
}
