package com.fpmislata.web_movies.persistence.dao;

import com.fpmislata.web_movies.domain.model.Director;

public interface DirectorDao {

    Director findByImdbId(String imdbId);
}
