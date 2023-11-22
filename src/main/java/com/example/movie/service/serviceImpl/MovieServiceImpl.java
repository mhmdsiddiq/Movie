package com.example.movie.service.serviceImpl;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;
import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMovie(Movie movie) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        movie.setCreatedAt(now);
        movie.setUpdatedAt(now);
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
