package com.saraya.ExpressMoviesApp.repository;

import com.saraya.ExpressMoviesApp.entity.Movie_Director;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface Movie_DirectorRepo extends PagingAndSortingRepository<Movie_Director,Integer> {
}
