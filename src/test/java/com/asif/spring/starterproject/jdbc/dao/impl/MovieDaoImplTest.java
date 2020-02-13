package com.asif.spring.starterproject.jdbc.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asif.spring.starterproject.jdbc.dao.MovieDao;
import com.asif.spring.starterproject.jdbc.dto.MovieDto;

public class MovieDaoImplTest {
	
	public static int addMovie(MovieDao movieDao) {
		MovieDto movie = new MovieDto();
		movie.setId("024192f8-dc97-4c3d-8c83-4233dc225e63");
		movie.setMovieName("Once upon a time");
		movie.setMovieRatings("4.0");
		return movieDao.addMovie(movie);
	}
	
	public static int updateMovie(MovieDao movieDao) {
		MovieDto movie = new MovieDto();
		movie.setId("024192f8-dc97-4c3d-8c83-4233dc225e63");
		movie.setMovieName("Once upon a time");
		movie.setMovieRatings("4.1");
		return movieDao.updateMovie(movie);
	}
	
	public static int deleteMovie(MovieDao movieDao) {
		MovieDto movie = new MovieDto();
		movie.setId("024192f8-dd97-4c3d-8c83-4233dc225e63");
		movie.setMovieName("Prestige");
		movie.setMovieRatings("4.9");
		movieDao.addMovie(movie);
		return movieDao.deleteMovie(movie);
	}
	
	public static MovieDto getMovie(MovieDao movieDao, String id) {
		return movieDao.getMovie(id);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/asif/spring/starterproject/jdbc/dao/impl/config.xml");
		MovieDao movieDao = (MovieDao) ctx.getBean("movieDao");
		
		System.out.println(movieDao.getAllMovies());
	}
}
