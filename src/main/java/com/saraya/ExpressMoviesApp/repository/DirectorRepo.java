package com.saraya.ExpressMoviesApp.repository;

import com.saraya.ExpressMoviesApp.entity.Director;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "director",path = "director")
public interface DirectorRepo extends JpaRepository<Director,Integer> {
}
