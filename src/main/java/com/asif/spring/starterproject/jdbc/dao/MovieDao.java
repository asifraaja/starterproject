package com.asif.spring.starterproject.jdbc.dao;

import java.util.List;

import com.asif.spring.starterproject.jdbc.dto.MovieDto;

public interface MovieDao {
	int addMovie(MovieDto movie);
	
	int updateMovie(MovieDto movie);
	
	int deleteMovie(MovieDto movie);
	
	MovieDto getMovie(String id);
	
	List<MovieDto> getAllMovies();
}
