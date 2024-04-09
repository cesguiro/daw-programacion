package com.fpmislata.web_movies.persistence.dao.impl.jdbc;

import com.fpmislata.web_movies.domain.model.Director;
import com.fpmislata.web_movies.persistence.dao.DirectorDao;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.mapper.DirectorMapper;
import com.fpmislata.web_movies.persistence.dao.impl.jdbc.queryBuilder.DB;

import java.sql.ResultSet;

public class DirectorDaoJdbc implements DirectorDao {

    @Override
    public Director findByImdbId(String imdbId) {
        ResultSet resultSet = DB.table("directors").where("imdb_id", "=", imdbId).get();
        try {
            if(!resultSet.next()) {
                return null;
            }
            return DirectorMapper.toDirector(resultSet);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener el director.");
        }
    }
}
