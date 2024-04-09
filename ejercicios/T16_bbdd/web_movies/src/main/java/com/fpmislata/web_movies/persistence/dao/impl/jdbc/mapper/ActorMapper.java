package com.fpmislata.web_movies.persistence.dao.impl.jdbc.mapper;

import com.fpmislata.web_movies.domain.model.Actor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorMapper {

    public static Actor toActor(ResultSet resultSet) throws SQLException {
        if (resultSet == null) {
            return null;
        }
        return new Actor(
                resultSet.getInt("id"),
                resultSet.getString("imdb_id"),
                resultSet.getString("name"),
                resultSet.getInt("birth_year"),
                resultSet.getInt("death_year")
        );
    }

    public static List<Actor> toActorList(ResultSet resultSet) throws SQLException {
        List<Actor> actorList = new ArrayList<>();
        while (resultSet.next()) {
            actorList.add(toActor(resultSet));
        }
        return actorList;
    }
}
