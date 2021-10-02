package com.saraya.ExpressMoviesApp.entity;

import javax.persistence.*;

@Entity
@Table(name = "director")
public class Director {
    @Id
    @Column
    private Integer Director_Id;
    private String First_Name;
    private String Last_Name;
    private String Adress;
    private int Contact_Number;
    private String Email;

    @OneToOne(mappedBy = "director",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    Movie_Director movie_director;

    public Director() {
    }

    public Director(int director_Id, String first_Name, String last_Name, String adress, int contact_Number, String email) {
        Director_Id = director_Id;
        First_Name = first_Name;
        Last_Name = last_Name;
        Adress = adress;
        Contact_Number = contact_Number;
        Email = email;
    }

    public int getDirector_Id() {
        return Director_Id;
    }

    public void setDirector_Id(int director_Id) {
        Director_Id = director_Id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(int contact_Number) {
        Contact_Number = contact_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
