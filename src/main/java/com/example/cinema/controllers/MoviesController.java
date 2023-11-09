package com.example.cinema.controllers;

import com.example.cinema.models.Movies;
import com.example.cinema.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MoviesController {


        @Autowired
        MoviesService moviesService;

        @PostMapping
        public ResponseEntity<Movies> createNewMovie(@RequestBody Movies newMovies){
            Movies createdmovies = moviesService.createMovies(newMovies);
            return new ResponseEntity<>( createdmovies, HttpStatus.CREATED);
        }

        @GetMapping
        public List<Movies> getAllMovies() {
            return moviesService.getAllMovies();
        }

        @GetMapping(value = "/id")
        public ResponseEntity<Movies> getMoviesById(@PathVariable long id) {
            Movies movies = moviesService.getMoviesById(id);
            return new ResponseEntity<>(movies, HttpStatus.OK);
        }

    }
