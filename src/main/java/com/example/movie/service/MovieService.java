package com.example.movie.service;

import com.example.movie.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovie();

    Movie getMovieById(Long id);

    void saveMovie(Movie caleg) throws Exception;

    void deleteMovie(Long id);
}
