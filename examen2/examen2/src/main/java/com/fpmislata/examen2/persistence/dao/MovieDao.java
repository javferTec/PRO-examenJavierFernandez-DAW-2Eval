package com.fpmislata.examen2.persistence.dao;

import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;

import java.util.List;

public interface MovieDao {
    List<MovieEntity> findAll();

    MovieEntity findById(int id);
}
