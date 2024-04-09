package com.fpmislata.web_movies.persistence.dao;

import com.fpmislata.web_movies.domain.model.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> findAll();

    Movie findById(int id);
}
