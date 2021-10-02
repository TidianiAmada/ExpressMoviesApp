package com.saraya.ExpressMoviesApp.entity;


import javax.persistence.*;

public class Movie_Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int Director_Id;
    private int Movie_Id;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "Director_Id", referencedColumnName = "Director_Id",nullable = false)
    private Director director;
    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "Movie_Id",referencedColumnName = "Movie_Id",nullable = false)
    private Movie movie;

    public Movie_Director() {
    }

    public Movie_Director(int director_Id, int movie_Id) {
        Director_Id = director_Id;
        Movie_Id = movie_Id;
    }
}
