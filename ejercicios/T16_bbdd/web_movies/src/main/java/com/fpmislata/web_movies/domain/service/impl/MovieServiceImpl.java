package com.fpmislata.web_movies.domain.service.impl;

import com.fpmislata.web_movies.domain.model.Movie;
import com.fpmislata.web_movies.domain.service.MovieService;
import com.fpmislata.web_movies.persistence.repository.MovieRepository;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(int id) {
        Movie movie = movieRepository.findById(id);
        if (movie == null) {
            throw new RuntimeException("La película no existe.");
        }
        return movie;
    }
}
