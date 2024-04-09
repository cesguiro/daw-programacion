package com.fpmislata.web_movies.persistence.repository.impl;

import com.fpmislata.web_movies.domain.model.Movie;
import com.fpmislata.web_movies.persistence.dao.MovieDao;
import com.fpmislata.web_movies.persistence.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private final MovieDao movieDao;

    public MovieRepositoryImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }


    @Override
    public List<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Movie findById(int id) {
        return movieDao.findById(id);
    }
}
