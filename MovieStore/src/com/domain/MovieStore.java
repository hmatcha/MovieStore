package com.domain;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {

	List<Movie> allMovies;
	List<Movie> cart = new ArrayList<Movie>();

	public List<Movie> getMoviesInCart() {
		return cart;
	}

	public MovieStore(List<Movie> allMovies) {
		super();
		this.allMovies = allMovies;

	}

	public List<Movie> getMovies() {

		return allMovies;
	}

	public List<Movie> addMoviesToCart(String name, String type) {
		for (Movie movie : allMovies) {
			
			System.out.println("Movie Name = " + movie.getMovieName() +" Type = "+movie.getType());
			
			if (name == movie.getMovieName() && type.equalsIgnoreCase(movie.getType().toString())) {
				cart.add(movie);
				break;
			} else
				continue;
		}
		return cart;
	}
	
}
