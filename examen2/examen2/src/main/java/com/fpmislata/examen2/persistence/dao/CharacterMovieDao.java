package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.CharacterMovieEntity;

import java.util.List;

public interface CharacterMovieDao {
    List<CharacterMovieEntity> findAll();

    CharacterMovieEntity findById(int id);
}
