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
        MoviesService moviesservice;

        @PostMapping
        public ResponseEntity<Movies> newMovie(){
            Movies movies = moviesService.getNewMovie();
            return new ResponseEntity<>( movies, HttpStatus.CREATED);
        }



        @GetMapping(value = "/id")
        public Movies getMoviesById(@PathVariable long id) {
            return getMovies.getMoivesById(id).orElse(null);
        }

    }
