package com.fpmislata.web_movies.persistence.dao;

import com.fpmislata.web_movies.domain.model.Actor;

import java.util.List;

public interface ActorDao {
    List<Actor> findByMovieId(int id);
}
