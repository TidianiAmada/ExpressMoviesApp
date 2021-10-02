package com.saraya.ExpressMoviesApp.restcontroller;

import com.saraya.ExpressMoviesApp.entity.Director;
import com.saraya.ExpressMoviesApp.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorRestController {
    @Autowired
    DirectorService directorService;
    @PostMapping("/directors")
    public void addingDirector(@RequestBody Director director){
        directorService.addDirector(director);
    }
}
