package com.fpmislata.web_movies.controller;

import com.fpmislata.web_movies.common.MovieIoc;
import com.fpmislata.web_movies.domain.model.Movie;
import com.fpmislata.web_movies.domain.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(MovieController.URL)
public class MovieController {

    public static final String URL = "/movies";

    private final MovieService movieService;

    public MovieController() {
        this.movieService = MovieIoc.getMovieService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("movieList", movieService.findAll());
        return "movies/list";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("movie", movieService.findById(id));
        return "movies/detail";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("movie", new Movie());
        return "movies/detail";
    }

}
