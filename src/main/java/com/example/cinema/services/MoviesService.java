package com.example.cinema.services;


import com.example.cinema.respositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {

    private final MoviesRepository moviesRepository;

    @Autowired
    public MoviesService(MoviesRepository movieRepository) {
        this.moviesRepository = movieRepository;
    }
}
