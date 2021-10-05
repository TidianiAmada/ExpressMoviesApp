package com.saraya.ExpressMoviesApp.repository;

import com.saraya.ExpressMoviesApp.entity.Movie_Director;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Movie_DirectorRepo extends JpaRepository<Movie_Director,Integer> {
}
