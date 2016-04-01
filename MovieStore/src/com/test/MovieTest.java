package com.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.domain.Movie;
import com.domain.MovieStore;
import com.domain.MovieType;
import com.domain.TextFixture;

public class MovieTest {
	String fetchedMovieName;

	TextFixture tf = new TextFixture();
	MovieStore movieStore = tf.populateMovieStore();

	List<Movie> movies = movieStore.getMovies();

	MovieType type;

//	@Test
	 @Ignore
	public void fetchingTheDesiredMovieFromTheMovieStore() {
		String movieName = "Lego";
		String type = "DVD";

		for (Movie movie : movies) {

			System.out.println("Movie Name in MovieTest  = "
					+ movie.getMovieName() + " Type = " + movie.getType());

			System.out.println(movieName.equalsIgnoreCase(movie.getMovieName())
					&& type.equalsIgnoreCase(movie.getType().toString()));

			if (movieName.equalsIgnoreCase(movie.getMovieName())
					&& type.equalsIgnoreCase(movie.getType().toString())) {
				fetchedMovieName = movie.getMovieName() + movie.getType();
				System.out.println(fetchedMovieName);
				break;
			}

			else {
				continue;

			}

		}
		assertEquals("LegoDVD", fetchedMovieName);
	}

	 @Test
	//@Ignore
	public void addMoviesToCart() {

		List<Movie> cart = movieStore.addMoviesToCart("Lego", "DVD");

		for (Movie movieInCart : cart) {
			String name = movieInCart.getMovieName();

			System.out.println("Movie Added to cart = " + name);
		}

	}

}
