package com.fpmislata;

import java.sql.Connection;
import java.util.List;

public class SqlInjection {


    public static void main(String[] args) {
        String title = "Primera plana";
        //String title = "Primera plana' OR '1'='1";
        //String title = "'; DELETE FROM movies WHERE '1'='1";
        String sql = "SELECT * FROM movies WHERE title = '" + title + "'";
        System.out.println(sql);
    }
}
