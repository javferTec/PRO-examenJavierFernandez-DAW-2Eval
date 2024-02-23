package com.fpmislata.examen2.domain.entity;

public class Movie {
    private int id;
    private String title;
    private int year;
    private Director director;

    public Movie(int id, String title, int year, Director director) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
    }

    public Movie(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
