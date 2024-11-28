package com.microservices.movie.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(unique = true, nullable = false)
    private String username;

    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

    private String password;
    public String getRole() {
      return role;
    }

    public void setRole(String role) {
      this.role = role;
    }

    private String role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    public List<Booking> getBookings() {
      return bookings;
    }

    public void setBookings(List<Booking> bookings) {
      this.bookings = bookings;
    }

}
