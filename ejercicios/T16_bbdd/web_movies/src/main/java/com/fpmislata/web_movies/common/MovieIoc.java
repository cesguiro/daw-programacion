package com.fpmislata.web_movies.common;

import com.fpmislata.web_movies.domain.service.MovieService;
import com.fpmislata.web_movies.domain.service.impl.MovieServiceImpl;
import com.fpmislata.web_movies.persistence.dao.MovieDao;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.MovieDaoJdbc;
import com.fpmislata.web_movies.persistence.repository.MovieRepository;
import com.fpmislata.web_movies.persistence.repository.impl.MovieRepositoryImpl;

public class MovieIoc {

    private static MovieService movieService;
    private static MovieRepository movieRepository;
    private static MovieDao movieDao;

    public static MovieService getMovieService() {
        if (movieService == null) {
            movieService = new MovieServiceImpl(getMovieRepository());
        }
        return movieService;
    }

    public static MovieRepository getMovieRepository() {
        if (movieRepository == null) {
            movieRepository = new MovieRepositoryImpl(getMovieDao());
        }
        return movieRepository;
    }

    public static MovieDao getMovieDao() {
        if (movieDao == null) {
            movieDao = new MovieDaoJdbc();
        }
        return movieDao;
    }
}
