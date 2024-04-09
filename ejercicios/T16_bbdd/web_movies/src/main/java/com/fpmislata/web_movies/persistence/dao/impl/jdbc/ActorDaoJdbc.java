package com.fpmislata.web_movies.persistence.dao.impl.jdbc;

import com.fpmislata.web_movies.domain.model.Actor;
import com.fpmislata.web_movies.persistence.dao.ActorDao;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.mapper.ActorMapper;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.queryBuilder.DB;

import java.sql.ResultSet;
import java.util.List;

public class ActorDaoJdbc implements ActorDao {
    @Override
    public List<Actor> findByMovieId(int id) {
        ResultSet resultSet = DB
                .table("actors")
                .join("actors_movies", "actors.imdb_id", "actors_movies.actor_id")
                .join("movies", "actors_movies.movie_id", "movies.imdb_id")
                .where("movies.id", "=",  id)
                .get();
        try {
            return ActorMapper.toActorList(resultSet);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la lista de actores.");
        }
    }
}
