package com.saraya.ExpressMoviesApp.repository;

import com.saraya.ExpressMoviesApp.entity.Movie;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface MovieRepo extends PagingAndSortingRepository<Movie,Integer> {
}
