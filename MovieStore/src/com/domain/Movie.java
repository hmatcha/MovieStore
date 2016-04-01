package com.domain;

public class Movie {

	private int movieId;
	private String movieName;
	private MovieGenre genre;
	private double rentalPerDayperMovie;
	private MovieType type;

	public Movie(int id, String movieName, MovieGenre genre,
			double rentalPerDayperMovie, MovieType type) {
		this.movieId = id;
		this.movieName = movieName;
		this.genre = genre;
		this.rentalPerDayperMovie = rentalPerDayperMovie;
		this.type = type;
	}

	public Movie(String movieName, MovieGenre genre,
			double rentalPerDayperMovie, MovieType type) {
		this.movieName = movieName;
		this.genre = genre;
		this.rentalPerDayperMovie = rentalPerDayperMovie;
		this.type = type;

	}


	public int getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public MovieGenre getGenre() {
		return genre;
	}

	public double getRentalPerDayperMovie() {
		return rentalPerDayperMovie;
	}

	public MovieType getType() {
		return type;
	}
	

}
