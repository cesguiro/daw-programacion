package com.fpmislata.web_movies.persistence.dao.impl.jdbc;

import com.fpmislata.web_movies.domain.model.Movie;
import com.fpmislata.web_movies.persistence.dao.MovieDao;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.mapper.MovieMapper;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.queryBuilder.DB;

import java.sql.ResultSet;
import java.util.List;

public class MovieDaoJdbc implements MovieDao {
    @Override
    public List<Movie> findAll() {
        ResultSet resultSet = DB.table("movies").get();
        try {
            return MovieMapper.toMovieList(resultSet);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la lista de películas.");
        }
    }

    @Override
    public Movie findById(int id) {
        ResultSet resultSet = DB.table("movies").find(id);
        try {
            return MovieMapper.toMovieWithActorsAndDirector(resultSet);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la película.");
        }
    }
}
