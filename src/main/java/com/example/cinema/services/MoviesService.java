package com.example.cinema.services;


import com.example.cinema.models.Movies;
import com.example.cinema.respositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {

    private final MoviesRepository moviesRepository;

    @Autowired
    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    public Movies createMovies(Movies movies) {
        return moviesRepository.save(movies);
    }

    public Movies getMoviesById(long id) {
        return moviesRepository.findById(id).orElse(null);
    }
}
