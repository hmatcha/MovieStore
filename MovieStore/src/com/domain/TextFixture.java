package com.domain;

import java.util.ArrayList;
import java.util.List;

public class TextFixture {

	public MovieStore populateMovieStore() {

		List<Movie> Movies = new ArrayList<Movie>();

		Movie legoDVD = new Movie("Lego", MovieGenre.Kids, 1.50, MovieType.DVD);
		Movie legoBluRay = new Movie("Lego", MovieGenre.Kids, 2.50,
				MovieType.BluRay);

		Movie frozenDVD = new Movie("Frozen", MovieGenre.Kids, 1.50,
				MovieType.DVD);
		Movie frozenBluRay = new Movie("Frozen", MovieGenre.Kids, 2.00,
				MovieType.BluRay);

		Movie mockingJayDVD = new Movie("MockingJay", MovieGenre.Regular, 1.00,
				MovieType.DVD);
		Movie mockingJayBluRay = new Movie("MockingJay", MovieGenre.Regular,
				2.00, MovieType.BluRay);

		Movie spectreBluRay = new Movie("Spectre", MovieGenre.Regular, 2.00,
				MovieType.BluRay);
		Movie spectreDVD = new Movie("Spectre", MovieGenre.Regular, 1.00,
				MovieType.DVD);

		Movies.add(legoDVD);
		Movies.add(legoBluRay);
		Movies.add(frozenDVD);
		Movies.add(frozenBluRay);
		Movies.add(mockingJayDVD);
		Movies.add(mockingJayBluRay);
		Movies.add(spectreBluRay);
		Movies.add(spectreDVD);

		MovieStore movieStore = new MovieStore(Movies);
		
		return movieStore;
	}

}
