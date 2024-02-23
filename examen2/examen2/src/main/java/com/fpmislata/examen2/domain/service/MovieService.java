package com.fpmislata.examen2.domain.service;

import com.fpmislata.examen2.domain.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(int id);
}
