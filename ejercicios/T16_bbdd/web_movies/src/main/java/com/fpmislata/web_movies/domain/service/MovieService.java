package com.fpmislata.web_movies.domain.service;

import com.fpmislata.web_movies.domain.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(int id);
}
