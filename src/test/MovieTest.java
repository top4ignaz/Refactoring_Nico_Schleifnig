package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.*;

class MovieTest {
	
	Movie movie;
	String title = "StarWars";
	int priceCode = 2;
	
	@BeforeEach
	void setup() {
		movie = new Movie(title, priceCode);
	}
	

	@Test
	void testGetPriceCode() {
		assertEquals(priceCode, movie.getPriceCode());
	}
	
	@Test
	void testGetTitle() {
		assertEquals(title, movie.getTitle());
	}
	
	@Test
	void testSetPriceCode() {
		movie.setPriceCode(priceCode);
		assertEquals(priceCode, movie.getPriceCode());
	}

}
