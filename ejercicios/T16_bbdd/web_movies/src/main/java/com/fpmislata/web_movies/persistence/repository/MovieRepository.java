package com.fpmislata.web_movies.persistence.repository;

import com.fpmislata.web_movies.domain.model.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();

    Movie findById(int id);
}
