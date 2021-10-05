package com.saraya.ExpressMoviesApp.entity;


import javax.persistence.*;

@Entity
@Table
public class Movie_Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @OneToOne(fetch = FetchType.LAZY,optional = false, targetEntity = Director.class)
    @JoinColumn(name = "Director_Id", referencedColumnName = "Director_Id",nullable = false)
    private Director director;

    @OneToOne(fetch = FetchType.LAZY,optional = false, targetEntity = Movie.class)
    @JoinColumn(name = "Movie_Id",referencedColumnName = "Movie_Id",nullable = false)
    private Movie movie;

    public Movie_Director() {
    }
}
