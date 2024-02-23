package com.fpmislata.examen2.persistence.repository.impl;

import com.fpmislata.examen2.common.container.CharacterMovieIoC;
import com.fpmislata.examen2.common.container.DirectorIoC;
import com.fpmislata.examen2.domain.entity.CharacterMovie;
import com.fpmislata.examen2.domain.entity.Director;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.persistence.dao.CharacterMovieDao;
import com.fpmislata.examen2.persistence.dao.DirectorDao;
import com.fpmislata.examen2.persistence.dao.MovieDao;
import com.fpmislata.examen2.persistence.dao.entity.MovieEntity;
import com.fpmislata.examen2.persistence.repository.MovieRepository;
import com.fpmislata.examen2.persistence.repository.mapper.CharacterMovieMapper;
import com.fpmislata.examen2.persistence.repository.mapper.DirectorMapper;
import com.fpmislata.examen2.persistence.repository.mapper.MovieMapper;

import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private MovieDao movieDao;
    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> findAll() {
        return MovieMapper.toMovieList(movieDao.findAll());
    }

    @Override
    public Movie findById(int id) {
        // DAOs
        DirectorDao directorDao = DirectorIoC.getDirectorDao();
        CharacterMovieDao characterDao = CharacterMovieIoC.getCharacterDao();

        // Entities
        MovieEntity movieEntity = movieDao.findById(id);
        Director director = DirectorMapper.toDirector(directorDao.findById(movieEntity.getId()));

        Movie movie = MovieMapper.toMovie(movieEntity);
        movie.setDirector(director);

        return movie;
    }
}
