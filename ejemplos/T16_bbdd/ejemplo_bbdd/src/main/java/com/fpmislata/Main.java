package com.fpmislata;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*String sql = """
                INSERT INTO movies (imdb_id, title, year, image, runtime, description, director_id) 
                VALUES (?, ?, ?, null, ?, null, ?)                    
            """;
        List<Object> params = List.of(
                "tt0071524", "Primera plana", 1974, 105, "nm0000697"
        );
        System.out.println("Película insertada con id " + RawSql.insert(sql, params));*/

        try {
            ResultSet resultSet = RawSql.select("SELECT * FROM movies", null);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("title"));
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar las películas");
        }
    }
}