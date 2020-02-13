package com.asif.spring.starterproject.jdbc.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper<MovieDto> {

	@Override
	public MovieDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		MovieDto movie = new MovieDto();
		movie.setId(rs.getString("id"));
		movie.setMovieName(rs.getString("movie_name"));
		movie.setMovieRatings(rs.getString("movie_ratings"));
		return movie;
	}

}
