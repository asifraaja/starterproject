package com.asif.spring.starterproject.jdbc.dao.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.asif.spring.starterproject.jdbc.dao.MovieDao;
import com.asif.spring.starterproject.jdbc.dto.MovieDto;
import com.asif.spring.starterproject.jdbc.dto.MovieRowMapper;

public class MovieDaoImpl implements MovieDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addMovie(MovieDto movie) {
		String sql = "insert into movies values(?,?,?)";
		return jdbcTemplate.update(sql, movie.getId(), movie.getMovieName(), movie.getMovieRatings());
	}

	@Override
	public int updateMovie(MovieDto movie) {
		String sql = "update movies set movie_name=?,movie_ratings=? where id=?";
		return jdbcTemplate.update(sql, movie.getMovieName(), movie.getMovieRatings(), movie.getId());
	}

	@Override
	public int deleteMovie(MovieDto movie) {
		String sql = "delete from movies where id=?";
		return jdbcTemplate.update(sql, movie.getId());
	}

	@Override
	public MovieDto getMovie(String id) {
		String sql = "select * from movies where id=?";
		MovieRowMapper movieRowMapper = new MovieRowMapper();
		try {
		 return jdbcTemplate.queryForObject(sql, movieRowMapper, id);
		}catch(EmptyResultDataAccessException ex) {
			return null;
		}
		
	}

	@Override
	public List<MovieDto> getAllMovies() {
		List<MovieDto> movies;
		String sql = "select * from movies";
		MovieRowMapper movieRowMapper = new MovieRowMapper();
		movies = jdbcTemplate.query(sql, movieRowMapper);
		return movies;
	}
}
