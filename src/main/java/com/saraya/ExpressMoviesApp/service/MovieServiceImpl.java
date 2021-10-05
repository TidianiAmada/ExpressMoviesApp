package com.saraya.ExpressMoviesApp.service;

import com.saraya.ExpressMoviesApp.entity.Movie;
import com.saraya.ExpressMoviesApp.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
    @Autowired
    MovieRepo movieRepo;
    @Override
    public void addMovie(Movie movie) {
        movieRepo.save(movie);
    }
}
