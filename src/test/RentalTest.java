package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import main.Movie;
import main.Rental;

class RentalTest {
	
	Rental rental;
	Movie movie;
	int daysRented = 12;
	String movieTitle = "StarWars";

	@BeforeEach
	void setup() {
		movie = new Movie(movieTitle, 2);
		rental = new Rental(movie, daysRented);
	}

	@Test
	void testGetDaysRented() {
		assertEquals(daysRented, rental.getDaysRented());
	}

	@Test
	void testGetMovie() {
		assertEquals(movie, rental.getMovie());
	}

}
