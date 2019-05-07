package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.*;

class CustomerTest {

	Customer customer;
	String customerName = "Peter";

	@BeforeEach
	void setup() {
		customer = new Customer(customerName);
	}

	@Test
	void testAddRental() {
		Rental rentalToAdd = new Rental(new Movie("StarWars", 2), 12);
		customer.addRental(rentalToAdd);
		assertTrue(customer.getRentals().contains(rentalToAdd));
	}

	@Test
	void testGetName() {
		assertEquals(customerName, customer.getName());
	}

	@Test
	void testStatement() {
		customer.addRental(new Rental(new Movie("testmovie 1", Movie.CHILDRENS), 3));
		customer.addRental(new Rental(new Movie("testmovie 2", Movie.REGULAR), 2));

		assertTrue(customer.statement().contains("\t" + "\t" + 3 + "\t" + 1.5 + "\n"));
        assertTrue(customer.statement().contains("\t" + "\t" + 2 + "\t" + 2.0 + "\n"));
        
        assertTrue(customer.statement().contains("Amount owed is " + 3.5));
        
	}

}
