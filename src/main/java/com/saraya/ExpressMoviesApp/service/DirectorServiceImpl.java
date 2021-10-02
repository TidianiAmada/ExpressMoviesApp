package com.saraya.ExpressMoviesApp.service;

import com.saraya.ExpressMoviesApp.entity.Director;
import com.saraya.ExpressMoviesApp.repository.DirectorRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class DirectorServiceImpl implements DirectorService{
    @Autowired
    DirectorRepo directorRepo;
    @Override
    public void addDirector(Director director) {
        directorRepo.save(director);
    }
}
