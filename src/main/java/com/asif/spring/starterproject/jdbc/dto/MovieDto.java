package com.asif.spring.starterproject.jdbc.dto;

public class MovieDto {
	private String id;
	private String movieName;
	private String movieRatings;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRatings() {
		return movieRatings;
	}
	public void setMovieRatings(String movieRatings) {
		this.movieRatings = movieRatings;
	}
	@Override
	public String toString() {
		return "MovieDto [id=" + id + ", movieName=" + movieName + ", movieRatings=" + movieRatings + "]\n";
	}
}
