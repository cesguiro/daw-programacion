package com.fpmislata.web_movies.domain.model;

import java.util.List;

public class Movie {

    private int id;
    private String imdbId;
    private String title;
    private int year;
    private int runtime;
    private Director director;
    private List<Actor> actorList;

    public Movie(int id, String imdbId, String title, int year, int runtime) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.year = year;
        this.runtime = runtime;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public void addActor(Actor actor) {
        actorList.add(actor);
    }

    public void removeActor(Actor actor) {
        actorList.remove(actor);
    }

}
