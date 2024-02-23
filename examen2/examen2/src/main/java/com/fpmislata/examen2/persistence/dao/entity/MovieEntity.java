package com.fpmislata.examen2.persistence.dao.entity;

public class MovieEntity {

    private int id;
    private String title;
    private int year;
    private int directorId;

    public MovieEntity(int id, String title, int year, int directorId) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.directorId = directorId;
    }
}
