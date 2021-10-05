package com.saraya.ExpressMoviesApp.repository;

import com.saraya.ExpressMoviesApp.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "movie", path = "movie")
public interface MovieRepo extends JpaRepository<Movie,Integer> {

}
