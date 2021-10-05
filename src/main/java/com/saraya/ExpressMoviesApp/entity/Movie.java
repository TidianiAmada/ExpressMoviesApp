package com.saraya.ExpressMoviesApp.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(unique = true)
    private int Movie_Id;
    private String Movie_Title;
    private Date Date_Released;
    private Date Movie_Running_Time;
    @OneToOne(mappedBy = "movie" , fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Movie_Director.class)
    Movie_Director movie_director;

    public Movie() {
    }

    public Movie(int movie_Id, String movie_Title, Date date_Released, Date movie_Running_Time) {
        Movie_Id = movie_Id;
        Movie_Title = movie_Title;
        Date_Released = date_Released;
        Movie_Running_Time = movie_Running_Time;
    }

    public int getMovie_Id() {
        return Movie_Id;
    }

    public void setMovie_Id(int movie_Id) {
        Movie_Id = movie_Id;
    }

    public String getMovie_Title() {
        return Movie_Title;
    }

    public void setMovie_Title(String movie_Title) {
        Movie_Title = movie_Title;
    }

    public Date getDate_Released() {
        return Date_Released;
    }

    public void setDate_Released(Date date_Released) {
        Date_Released = date_Released;
    }

    public Date getMovie_Running_Time() {
        return Movie_Running_Time;
    }

    public void setMovie_Running_Time(Date movie_Running_Time) {
        Movie_Running_Time = movie_Running_Time;
    }
}
