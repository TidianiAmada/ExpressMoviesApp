package com.saraya.ExpressMoviesApp.restcontroller;

import com.saraya.ExpressMoviesApp.entity.Movie;
import com.saraya.ExpressMoviesApp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieRestController {
    @Autowired
    MovieService movieService;
    @PostMapping("/")
    public void addingMovie(@RequestBody Movie movie){

         movieService.addMovie(movie);
    }
}
