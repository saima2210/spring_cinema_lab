package com.example.cinema.respositories;

import com.example.cinema.models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, long> {
}
