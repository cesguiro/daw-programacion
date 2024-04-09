package com.fpmislata.web_movies.persistence.dao.impl.jdbc.mapper;

import com.fpmislata.web_movies.domain.model.Director;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectorMapper {
    public static Director toDirector(ResultSet resultSet) throws SQLException {
        return new Director(
                resultSet.getInt("id"),
                resultSet.getString("imdb_id"),
                resultSet.getString("name"),
                resultSet.getInt("birth_year"),
                resultSet.getInt("death_year")
        );
    }
}
