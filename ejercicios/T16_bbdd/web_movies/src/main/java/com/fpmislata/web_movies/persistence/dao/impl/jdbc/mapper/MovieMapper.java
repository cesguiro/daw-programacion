package com.fpmislata.web_movies.persistence.dao.impl.jdbc.mapper;

import com.fpmislata.web_movies.domain.model.Movie;
import com.fpmislata.web_movies.persistence.dao.ActorDao;
import com.fpmislata.web_movies.persistence.dao.DirectorDao;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.ActorDaoJdbc;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.DirectorDaoJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieMapper {

    public static Movie toMovie(ResultSet resultSet) throws SQLException {
        if (resultSet == null) {
            return null;
        }
        return new Movie(
                resultSet.getInt("id"),
                resultSet.getString("imdb_id"),
                resultSet.getString("title"),
                resultSet.getInt("year"),
                resultSet.getInt("runtime")
        );
    }

    public static Movie toMovieWithActorsAndDirector(ResultSet resultSet) throws SQLException {
        DirectorDao directorDao = new DirectorDaoJdbc();
        ActorDao actorDao = new ActorDaoJdbc();
        Movie movie = toMovie(resultSet);
        if(movie != null) {
            movie.setDirector(directorDao.findByImdbId(resultSet.getString("director_id")));
            movie.setActorList(actorDao.findByMovieId(movie.getId()));
        };
        return movie;
    }

    public static List<Movie> toMovieList(ResultSet resultSet) throws SQLException {
        List<Movie> movieList = new ArrayList<>();
        while (resultSet.next()) {
            movieList.add(toMovie(resultSet));
        }
        return movieList;
    }
}
