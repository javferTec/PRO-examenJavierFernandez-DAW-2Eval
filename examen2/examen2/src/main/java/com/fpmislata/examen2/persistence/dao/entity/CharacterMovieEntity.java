package com.fpmislata.examen2.persistence.dao.entity;

public class CharacterMovieEntity {

    private int id;
    private int movieId;
    private int actorId;

    private String characterName;

    public CharacterMovieEntity(int id, int movieId, int actorId, String characterName) {
        this.id = id;
        this.movieId = movieId;
        this.actorId = actorId;
        this.characterName = characterName;
    }
}
